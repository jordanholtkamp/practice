from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def deleteDuplicates(head: Optional[ListNode]):
    # head val = 1
    # next val if that value is equal to the current head, I can
    # delete that node, and look to the next one
    # if its different than i can say that next node is the new head
    current = head

    while current and current.next:
        if current.val == current.next.val:
            current.next = current.next.next #skipping same node
        else:
            current = current.next

    return head
    # next.next == head.next
    # if not then the head is next.next