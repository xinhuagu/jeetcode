class Solution {
  public int rob(int[] nums) {
    int len = nums.length;

    if( len == 0) return 0;

    int[] res = new int[len+1];

    res[len] = 0;
    res[len-1] = nums[len-1];

    for( int i = len -2; i >=0 ; --i){
      res[i] = Math.max(res[i+1],res[i+2] + nums[i]);
    }


    return res[0];
  }
}