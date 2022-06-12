class Solution {
  int[] nums;
  public int findMin(int[] nums) {
    this.nums = nums;
    var len = nums.length;

    if(len == 1) return nums[0];

    if(nums[0]<nums[len-1]) return nums[0];

    var rindx = rotateIndex(0, len-1);

    return nums[rindx];
  }

  public int rotateIndex(int left, int right) {

    while ( left <= right){
      var pivot = left + (right-left)/2;
      if(nums[pivot] > nums[pivot+1]){
        return pivot+1;
      }
      if(nums[pivot-1] > nums[pivot]){
        return pivot;
      }
      if(nums[pivot] > nums[0])
        left = pivot+1;
      else
        right = pivot-1;

    }

    return 0;
  }
}