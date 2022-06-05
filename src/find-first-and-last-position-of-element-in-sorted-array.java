class Solution {
  public int[] searchRange(int[] nums, int target) {
    var result = new int[2];
    result[0] = -1;
    result[1] = -1;

    var queue = new ArrayDeque<Integer>();

    for( var i = 0; i< nums.length ; i ++){
      if(nums[i] == target){
        queue.add(i);
      }
    }

    if(queue.size() >= 1){
      result[0] = queue.getFirst();
      result[1] = queue.getLast();
    }

    return result;
  }
}