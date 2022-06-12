class Solution {
  public int removePalindromeSub(String s) {
    if( isPalindromic(s)) {
      return 1;
    }else{
      return 2;
    }
  }

  public boolean isPalindromic(String s){
    var arr = s.toCharArray();
    var l = 0;
    var r = arr.length -1;

    while (l <= r){
      if( arr[l] == arr[r] ){
        l = l+1;
        r = r-1;
      }else{
        return false;
      }
    }
    return true;
  }
}