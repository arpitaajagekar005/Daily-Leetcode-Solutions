# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head

        slow=head
        fast=head
        prev=None

        while fast and fast.next:
            prev=slow
            slow=slow.next
            fast=fast.next.next
            
        if prev is None:
            head=None
        else:
            prev.next=slow.next
            slow.next=None

        return head