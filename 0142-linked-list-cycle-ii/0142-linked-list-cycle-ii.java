/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        HashSet<ListNode> set = new HashSet<>();

        while(fast != null && fast.next != null){
            if(set.contains(fast)){ 
                return fast;
            }
            set.add(fast);
            fast = fast.next;
      
        }
        return null;
    }
}