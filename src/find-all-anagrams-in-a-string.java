class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList();

    var sLen = s.length();
    var pLen = p.length();

    int[] pArr = new int[26];
    int[] sArr = new int[26];

    for(var ch : p.toCharArray()){
      pArr[ch-'a']++;
    }

    for(int i = 0; i < sLen; i++){
      sArr[s.charAt(i)-'a']++;
      if(i>=pLen){
        sArr[s.charAt(i-pLen) -'a']--;
      }

      if(Arrays.equals(pArr, sArr)){
        result.add(i-pLen +1);
      }
    }

    return result;
  }
}