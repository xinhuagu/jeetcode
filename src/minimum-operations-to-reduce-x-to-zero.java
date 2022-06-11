class Solution {
  public int minOperations(int[] nums, int x) {
    int total = 0;
    for( int num: nums){
      total += num;
    }

    int n = nums.length;
    int maxi = -1;
    int left = 0;
    int current = 0;

    for( int right = 0; right < n; right++){
      current += nums[right];
      while( current > total -x && left<= right){
        current= current - nums[left] ;
        left +=1;
      }

      if(current == total -x) {
        maxi = Math.max(maxi, right - left +1);
      }
    }

    return maxi != -1 ? n -maxi : -1 ;
  }
}