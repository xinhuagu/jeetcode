/**
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 * Memory Usage: 42.5 MB, less than 49.44% of Java online submissions for Plus One.
 */

class Solution {
  public int[] plusOne(int[] digits) {
    var carry = 0;

    var len = digits.length;
    var sum = 0;

    for( int i = len -1;  i >=0  ; i-- ){
      if( i == len -1){
        sum = digits[i] +1 ;
      }else{
        sum = digits[i] + carry;
      }
      if(sum > 9){
        carry = 1;
        digits[i]  = sum -10;
      }
      else {
        carry = 0;
        digits[i] = sum;
      }
    }

    if( carry == 1) {
      var res = new int[len+1];
      res[0] = 1;
      for(int i = 0; i < len ; i++){
        res[i+1] = digits[i];
      }
      return res;
    }
    return digits;
  }
}