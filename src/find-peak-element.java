class Solution {
  int[] nums = null;
  public int findPeakElement(int[] nums) {
    this.nums = nums;
    var len = nums.length;

    var left = 0;
    var right = len -1 ;
    if(len == 1) return 0;

    return search(0,len-1);

  }

  public int search(int l , int r){
    if(l == r ){
      return l;
    }
    int mid = (l+r)/2;
    if(nums[mid] > nums[mid+1]){
      return search(l, mid);
    }else{
      return search(mid+1, r);
    }
  }
}