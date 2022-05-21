class Solution {
  public String longestCommonPrefix(String[] strs) {
    var len = strs.length;
    var prefix = strs[0];

    var res = "";
    for( int i = 1; i < len ; i++){
      if( strs[i].indexOf(prefix)!=0) {
        while( strs[i].indexOf(prefix)!=0){
          prefix = prefix.substring(0, prefix.length() -1 );
          if(prefix.isEmpty()) return "";
        }
      }
    }


    return prefix;
  }
}