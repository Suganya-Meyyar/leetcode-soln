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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode one = dummy.next;
       ListNode curr = head; //1->
       ListNode prev=dummy; //0->
       while(curr!=null){ 
        
        while(curr.next!=null && curr.val==curr.next.val){//4==5
            curr=curr.next; // 3-> 4->
        }
        //first 4 != 2nd 4
        if(prev.next!=curr){ //dupli exist          
            prev.next=curr.next; //2->5
        }
        else{
            //0->1 == (curr)1 
            prev=prev.next; // 1->  2-> 
        }
        curr=curr.next; //1-> 2-> 3->
       }
       return dummy.next;
    }
}