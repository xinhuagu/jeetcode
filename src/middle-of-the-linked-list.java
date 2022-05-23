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

/**
 * solution 2.
 */

class Solution {
  public ListNode middleNode(ListNode head) {
    var slow = head;
    var fast = head;

    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}