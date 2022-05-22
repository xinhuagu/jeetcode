class Solution {
  public int firstMissingPositive(int[] nums) {
    var p = 1;
    var set = new HashSet<Integer>();

    for(int i = 0; i< nums.length; i++){
      set.add(nums[i]);
    }

    while(true ){
      if( !set.contains(p)) {
        return p;
      }
      ++p;
    }
  }
}