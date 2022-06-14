class Solution {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    if(k<=1) return 0;

    int prod = 1;
    var ans = 0;
    var left = 0;

    for( int right = 0; right <nums.length; right++){
      prod = prod * nums[right];
      while(prod>=k) prod /= nums[left++];
      ans = ans +right -left +1;
    }

    return ans;
  }
}