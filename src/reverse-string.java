class Solution {
  public void reverseString(char[] s) {
    var left = 0;
    var right = s.length-1;

    while(left <= right){
      var tmp = s[right];
      s[right]= s[left];
      s[left] = tmp;
      ++left;
      --right;
    }

  }
}