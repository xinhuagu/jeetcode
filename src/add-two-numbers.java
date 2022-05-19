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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    var p1 = l1;
    var p2 = l2;
    ListNode  p3 = new ListNode(-1);
    ListNode result = p3;
    var carry = 0;
    var sum = 0;
    while(p1 != null && p2 != null){
      sum = p1.val + p2.val + carry;
      if( sum >9 ){
        carry =1;
        p3.next = new ListNode(sum -10);
      }else{
        carry = 0;
        p3.next = new ListNode(sum);
      }
      p1 = p1.next;
      p2 = p2.next;
      p3 = p3.next;
    }

    while(p1 !=null){
      sum = p1.val + carry;
      if( sum >9){
        carry = 1;
        p3.next = new ListNode(sum -10);
      }else{
        carry =0;
        p3.next = new ListNode(sum);
      }
      p1 = p1.next;
      p3 = p3.next;

    }

    while(p2 !=null){
      sum = p2.val + carry;
      if( sum >9){
        carry = 1;
        p3.next = new ListNode(sum -10);
      }else{
        carry =0;
        p3.next = new ListNode(sum);
      }
      p2 = p2.next;
      p3 = p3.next;

    }
    if( carry == 1){
      p3.next= new ListNode(1);
    }

    return result.next;
  }

}