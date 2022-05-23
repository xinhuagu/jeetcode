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
  public ListNode middleNode(ListNode head) {
    var p = head;
    var size = 0;
    while( p!=null){
      ++size;
      p = p.next;
    }

    var mid = (int)Math.abs(size/2) +1;

    for(var i = 0 ; i <mid-1 ; i++){
      head = head.next;
    }
    return head;
  }
}