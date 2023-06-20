public class RemoveNthNode {
    /**
     *
     * @param head
     * @param n
     * @return head node after removing nth node
     */

    private static ListNode removeNthNode(ListNode head, int n) {

        // traverse linked list with temp head
        // keep a counter and increase by one each time you traverse
        // when counter + 1 = target, then bypass currentNode.next

        int counter = 1;
        ListNode temp = head;

        while (temp.next != null) {

            if (counter + 1 == n) {
                temp.next = temp.next.next;
                return head;
            } else {
                temp = temp.next;
            }
            counter++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        ListNode ans = removeNthNode(head, 4);
        System.out.println(ans.val);
        System.out.println(ans.next.val);
        System.out.println(ans.next.next.val);
        System.out.println(ans.next.next.next.val);

    }
}
