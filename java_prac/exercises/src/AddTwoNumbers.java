public class AddTwoNumbers {
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode();
        ListNode current = tempHead;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = carry + x + y;
            // Making a new node for next with the sum, and then setting that to current for next loop
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        return tempHead.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l12 = new ListNode(4);
        ListNode l22 = new ListNode(6);
        ListNode l13 = new ListNode(3);
        ListNode l23 = new ListNode(4);

        l1.next = l12;
        l2.next = l22;
        l12.next = l13;
        l22.next = l23;
        System.out.println(addTwoNumbers(l1, l2)); // expect to return [7, 0, 8]
    }
}
