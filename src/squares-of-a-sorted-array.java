/**
 * first solution : o(n+nlogn)
 *
 * class Solution {
 *     public int[] sortedSquares(int[] nums) {
 *         var len = nums.length;
 *
 *         for( int i =0 ; i < len  ; i++){
 *             nums[i] = nums[i] * nums[i] ;
 *
 *         }
 *
 *         Arrays.sort(nums);
 *         return nums;
 *     }
 * }
 *
 *
 *
 * the second solution : O(n)
 */

class Solution {
  public int[] sortedSquares(int[] nums) {
    var len = nums.length;
    var left = 0;
    var right = len-1;
    var idx = len-1;
    var result = new int[len];

    while ( left <= right ) {
      if( Math.abs(nums[left]) > Math.abs(nums[right])){
        result[idx] = nums[left] * nums[left];
        left = left+1;
      }else{
        result[idx] = nums[right] * nums[right];
        right = right-1;
      }
      idx--;
    }

    return result;



  }
}