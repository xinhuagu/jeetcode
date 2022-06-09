class Solution {
  public int firstUniqChar(String s) {
    var arr = s.toCharArray();
    var len = s.length();
    var p = 0;

    var map = new HashMap<Character,Integer>();

    while(p < len){
      if( map.containsKey(arr[p])) {
        var count = map.get(arr[p]) +1;
        map.put(arr[p] , count );
      }else{
        map.put(arr[p],1);
      }
      ++p;
    }

    for( int i = 0; i < len ; i++){
      if( map.get(arr[i])== 1)
        return i;
    }

    return -1;

  }

}