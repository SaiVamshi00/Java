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
public class Linked-list-cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast =head;
        ListNode slow=head;
       
            while(fast.next!=null){                 //At both the places fast.next and fast.next.next should be frequently checked else it may throw an error
                if(fast.next.next==null)            //which is can not access after null.
                    return false;
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow)
                    return true;
            }
            
        return false;
    }
}
