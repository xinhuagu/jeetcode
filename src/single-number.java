class Solution {
  public int singleNumber(int[] nums) {
    var set = new HashSet<Integer>();

    for(var i : nums){
      if( set.contains(i)) set.remove(i);
      else{
        set.add(i);
      }
    }
    for(var res : set){
      return res;
    }
    return 0;
  }
}