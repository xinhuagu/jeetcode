class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    var ans = Integer.MAX_VALUE;
    var len = nums.length;
    var l  = 0;
    var sum = 0;

    for( int i = 0; i < len; i++) {
      sum = sum + nums[i] ;
      while(sum >= target){
        ans = Math.min(ans, i-l+1);
        sum = sum - nums[l];
        l = l+1;
      }
    }

    return ans != Integer.MAX_VALUE ? ans:0;
  }
}