class Solution {
  public boolean areOccurrencesEqual(String s) {
    var charArr = new int[26];
    for(var c: s.toCharArray()){
      charArr[c-'a']++;
    }
    s.len
    var occ = charArr[s.charAt(0)-'a'];

    for(var i=0 ;i < charArr.length;++i){
      if( charArr[i]!= 0)
        if( charArr[i]!= occ){
          return false;
        }
    }
    return true;
  }
}