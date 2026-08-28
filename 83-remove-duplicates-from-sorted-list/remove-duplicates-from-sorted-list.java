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
        ListNode gd = head;
        while(gd != null && gd.next != null){
            if(gd.val == gd.next.val){
               gd.next = gd.next.next;
            }
            else gd = gd.next;
        }
        return head;
    }
}