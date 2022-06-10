class Solution {
  public boolean isAnagram(String s, String t) {
    var sLen = s.length();
    var tLen = t.length();
    if( sLen != tLen){
      return false;
    }

    var chaArr = new int[26];

    for(char ch : s.toCharArray()){
      chaArr[ch-'a'] = chaArr[ch-'a'] +1;
    }
    for(char ch : t.toCharArray()){
      chaArr[ch-'a'] = chaArr[ch-'a'] -1;
    }
    var newArr = new int[26];
    return Arrays.equals(newArr, chaArr);
  }
}