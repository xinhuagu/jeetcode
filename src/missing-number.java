class Solution {
  public int missingNumber(int[] nums) {
    var n = nums.length;
    Arrays.sort(nums);

    for( int i = 0; i <n; i++){
      if( i != nums[i]){
        return i;
      }
    }

    return nums[n-1]+1;
  }
}