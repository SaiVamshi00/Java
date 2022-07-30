/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Merge-sorted-ll {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(0); //created dummy node to get started
        ListNode curr=temp;            // variable to traverse through the linked list
        ListNode l1=list1,l2=list2;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){    //comparing both the values from the ll           
                curr.next=l1;     //storing the address of l1 node in the new merged ll
                l1=l1.next;      //updating l1
            }
            else{
                curr.next=l2;  //storing the address of l2 node in the new merged ll
                l2=l2.next;     //updating l2
            }
            curr=curr.next;
        }
        if(l1!=null)          //if any linked list is smaller than we perfrom any one of those
            curr.next=l1;
        if(l2!=null)
            curr.next=l2;
        return temp.next;     //removing the first dummy node and giving the address
    }
}
