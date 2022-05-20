class Solution {
  public int searchInsert(int[] nums, int target) {
    var len = nums.length;
    var left = 0;
    var right = len-1;
    var pivot = 0;

    while( left <= right){
      pivot = left + (right-left)/2;
      
      if( target <nums[pivot]){
        right = pivot -1;
      }else if(target == nums[pivot]){
        return pivot;
      }else{
        left = pivot +1;
      }
    }
    return left;

  }
}