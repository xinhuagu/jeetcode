class Solution {
  public int percentageLetter(String s, char letter) {
    var map = new HashMap<Character,Integer>();
    var arr = s.toCharArray();

    var repeat = 0;
    for(var ch : arr){
      if( ch == letter){
        ++repeat;
      }
    }
    return (int) ( ((double)repeat)/(double)s.length() * 100) ;

  }
}