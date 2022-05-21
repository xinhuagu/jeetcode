class Solution {
  public void moveZeroes(int[] nums) {
    var len = nums.length;
    if(len == 1) return ;


    var left = 0;
    var right = 0;
    while( left <  len){
      if( nums[left] == 0) {
        right = left +1;
        while( right<=len-1 && nums[right] == 0 ) {
          right++;
        }
        if( right > len-1){
          right = left;
        }
        var tmp = nums[right];
        nums[right] = nums[left];
        nums[left] = tmp;
      }

      left = left +1;


    }


  }
}