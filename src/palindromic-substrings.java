class Solution {
  public int countSubstrings(String s) {
    var res = 0;

    for(int start = 0; start< s.length(); ++start){
      for( int end= start; end<s.length(); ++end){
        if( isPalin(s,start,end)){
          res++;
        }
      }
    }

    return res;
  }

  public boolean isPalin(String s, int start, int end){
    while(start < end){
      if( s.charAt(start)!= s.charAt(end)){
        return false;
      }
      ++start;
      --end;
    }
    return true;
  }
}