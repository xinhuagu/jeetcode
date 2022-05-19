class Solution {
  public int lengthOfLongestSubstring(String str) {

    var map = new HashMap<Character,Integer>();
    var left=0;
    var ans = 0;

    for( int right = 0; right < str.length(); right++){
      var ch = str.charAt(right);
      if( map.containsKey(ch)){
        left = Math.max(left, map.get(ch)+1);
      }
      map.put(ch,right );
      ans = Math.max(ans, right-left+1);
    }
    return ans;
  }

}