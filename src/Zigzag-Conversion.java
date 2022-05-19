/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like
 * this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */



class Solution {
  public String convert(String s, int numRows) {

    if( numRows == 1) return s;
    var matrix = new ArrayList<List<Character>>();
    for( int i = 0; i < numRows ; i++){
      matrix.add(new ArrayList<Character>());
    }

    var i = 0;
    var back = false;
    for( var ch : s.toCharArray()){
      matrix.get(i).add(ch);
      if( !back){
        i = i+1;
      }else{
        i = i -1;
      }
      if( i>= numRows){
        back = true;
        i=i -2;
      }else if(i<0){
        back = false;
        i = i +2;
      }

    }
    var sb = new StringBuilder() ;
    for ( int k = 0 ; k < numRows ; k++){
      for( var chr : matrix.get(k)){
        sb.append(chr);
      }

    }

    return sb.toString();

  }
}