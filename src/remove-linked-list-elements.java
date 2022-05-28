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
  public ListNode removeElements(ListNode head, int val) {
    if( head == null)  return null;
    if ( head.next == null ){
      if( head.val == val ){
        return null;
      }else{
        return head;
      }
    }

    var pre = new ListNode(0);
    var result = pre;
    pre.next = head;
    var p = head;
    while( p !=null){
      if(p.val == val){
        pre.next = p.next;
      }else{
        pre = p;
      }
      p = p.next;
    }

    return result.next;
  }
}