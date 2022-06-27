class Solution {
  public int missingElement(int[] nums, int k) {

    var len = nums.length;
    var diff = 0;

    for(int i = 1; i< len; ++i){
      diff = nums[i] - nums[i-1] -1;
      if(diff >= k ) return nums[i-1]+k;
      k = k - diff;
    }

    return nums[len-1]+k;
  }
}