class Solution {
  public boolean isValid(String s) {
    if(s.length() ==1 ) return false;
    var stack = new ArrayDeque<Character>();

    for( int i = 0; i< s.length(); i++){
      var ch = s.charAt(i);
      if( ch == '(' ) {
        stack.push(')') ;
      }
      else if( ch == '[' ) {
        stack.push(']') ;
      }
      else if( ch == '{' ) {
        stack.push('}') ;
      }
      else if( ch == '(' ) {
        stack.push(')') ;
      }else{
        if( stack.isEmpty()) return false;
        if (  ch != stack.pop() ) {
          return false;
        }
      }
    }

    if( !stack.isEmpty()) return false;
    return true;

  }
}