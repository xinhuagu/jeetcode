/**
 * solution 1
 */
class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    var map = new HashMap<Character, Integer>();

    for(char ch : magazine.toCharArray()){
      map.merge(ch, 1, Integer::sum);
    }

    for(char c : ransomNote.toCharArray()){
      if(map.containsKey(c) && map.get(c) > 0){
        var count = map.get(c) -1;
        map.put(c, count);
      }else{
        return false;
      }
    }

    return true;
  }
}

/**
 * solution 2  ( worse performance)
 */
class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    var map = new HashMap<Character, Integer>();


    for(char c : ransomNote.toCharArray()){
      var idx = magazine.indexOf(c);
      if( idx != -1){
        magazine = magazine.substring(0,idx) + magazine.substring(idx+1);
      }else{
        return false;
      }


    }

    return true;
  }
}