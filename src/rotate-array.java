class Solution {
  public void rotate(int[] nums, int k) {
    var len = nums.length;
    k = k%len;
    reverse(nums, 0, len-1) ;
    reverse(nums, 0, k-1);
    reverse(nums, k, len-1);
  }

  public void reverse( int[] nums, int start, int end) {
    while(start<end){
      var tmp = nums[start];
      nums[start] = nums[end];
      nums[end] = tmp;
      start++;
      end--;
    }
  }
}