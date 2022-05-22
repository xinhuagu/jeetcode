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
  public ListNode mergeKLists(ListNode[] lists) {
    var len = lists.length;
    if ( len == 0) return null;
    if ( len == 1  ) return lists[0];

    var res = lists[0];
    for( int i = 1; i < lists.length; i++){
      res = merge(lists[i], res);
    }


    return res;


  }

  public ListNode merge(ListNode ln1, ListNode ln2){

    var res = new ListNode(-1);
    var p = res;

    while(ln1 != null && ln2 !=null) {
      if( ln1.val<ln2.val){
        p.next = new ListNode(ln1.val);
        ln1 = ln1.next;
      }else{
        p.next = new ListNode(ln2.val);
        ln2 = ln2.next;
      }
      p = p.next;
    }
    if (ln1 !=null){
      p.next = ln1;
    }
    if( ln2 != null){
      p.next = ln2;
    }
    return res.next;

  }
}