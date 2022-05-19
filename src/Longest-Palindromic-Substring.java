/**
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */

class Solution {
  int resultStart = 0;
  int resultLen = 0;
  public String longestPalindrome(String s) {
    if( s.length() ==1 ) return s;
    for( int i = 0; i < s.length() ; i++){
      expand(s, i , i);
      expand(s, i , i+1);
    }
    return s.substring(resultStart, resultLen + resultStart);
  }


  public void expand(String s, int left, int right){
    while( left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
      left--;
      right++;
    }
    left = left+1;
    right = right-1;

    if( resultLen < right - left +1){
      resultStart = left;
      resultLen = right - left +1;
    }
  }
}