class Solution {
  public boolean backspaceCompare(String s, String t) {
    var sDeque = new ArrayDeque();
    var tDeque = new ArrayDeque();

    for( var ch : s.toCharArray()){
      if( ch == '#' && !sDeque.isEmpty()){
        sDeque.removeLast();
      }else if( ch != '#')
        sDeque.add(ch);
    }
    for( var ch : t.toCharArray()){
      if( ch == '#' && !tDeque.isEmpty()){
        tDeque.removeLast();
      }else if(ch!='#')
        tDeque.add(ch);
    }

    if( sDeque.size() != tDeque.size()) return false;

    var sRe = "";
    var tRe = "";
    while(!sDeque.isEmpty()){
      sRe = sRe+  sDeque.removeFirst();
      tRe = tRe + tDeque.removeFirst();
    }


    return sRe.equalsIgnoreCase(tRe);
  }
}