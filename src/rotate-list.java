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
  public ListNode rotateRight(ListNode head, int k) {
    var size = 0;
    var p = head;
    while(p != null){
      ++size;
      p = p.next;
    }

    if( size == 0) return null;
    k = k%size;
    if( k == 0) return head;
    if( size == 1) return head;
    if ( size == k ) return head;


    p = head;

    for(int i = 0; i < size-k-1 ; i++){
      p = p.next;
    }

    var newhead = p.next;
    p.next = null;
    p = newhead;
    while(p.next !=null){
      p= p.next;
    }
    p.next = head;

    return newhead;
  }
}