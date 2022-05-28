class Solution {
  public int missingNumber(int[] nums) {
    var n = nums.length;
    var sum = ((n+1)*n) /2;
    var tmp = 0;
    for( int i = 0; i <n; i++){
      tmp = tmp + nums[i];
    }

    return sum-tmp;
  }
}