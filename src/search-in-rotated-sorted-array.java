class Solution {
  int[] nums;
  int target;

  public int search(int[] nums, int target) {
    this.nums = nums;
    this.target = target;
    var len = nums.length;
    if( len == 1) return this.nums[0] == target ? 0: -1;

    int rindex = rotateIndex(0, len-1);

    if(nums[rindex] == target) return rindex;
    if(rindex ==0) return search(0,len-1);
    if(target< nums[0])
      return search(rindex , len-1);
    return search(0, rindex);
  }


  public int rotateIndex(int left, int right){
    if(nums[left] < nums[right]){
      return 0;
    }
    while(left<=right){
      var pivot = (left + right)/2;
      if(nums[pivot] > nums[pivot +1 ]){
        return pivot +1;
      }
      else{
        if(nums[pivot] < nums[left]){
          right = pivot -1;
        }else{
          left = pivot +1;
        }
      }
    }

    return 0;
  }

  public int search(int left, int right){
    while(left <= right){
      int pivot = (left + right)/2;
      if(nums[pivot] == target ){
        return pivot;
      }else{
        if(target<nums[pivot]){
          right = pivot -1;
        }else{
          left = pivot+1;
        }
      }
    }
    return -1;
  }
}