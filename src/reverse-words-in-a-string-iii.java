class Solution {
  public String reverseWords(String s) {
    var arr = s.toCharArray();
    var left = 0;
    var right =0;
    while(right<s.length()){
      if( s.charAt(right)!=' ' && right != s.length()-1){
        ++right;
      }else{
        if( right == s.length()-1){
          if(s.charAt(right)!=' ' && s.charAt(left)!=' ' ){
            reverse(arr,left,right);
          }
          break;
        }
        if(s.charAt(left) != ' '){
          reverse(arr,left,right-1);
        }
        ++right;
        left=right;
      }

    }

    return new String(arr);
  }

  public void reverse(char[] arr, int start, int end){
    while(start<=end) {
      var tmp = arr[start] ;
      arr[start] = arr[end];
      arr[end]  = tmp;
      ++start;
      --end;
    }
  }
}