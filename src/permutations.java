class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();
    boolean[] visited = new boolean[nums.length];
    backtrack(result, tmp, visited, nums) ;
    return result;

  }

  public void backtrack( List<List<Integer>> result , List<Integer> tmp, boolean[] visited, final int[] nums){
    if( tmp.size() == nums.length){
      result.add(new ArrayList(tmp));
      return;
    }
    for( var i = 0; i < nums.length ; ++i){
      if( visited[i]){
        continue;
      }
      visited[i] = true;
      tmp.add(nums[i]);
      backtrack(result, tmp, visited, nums);
      tmp.remove(tmp.size()-1);
      visited[i] = false;
    }
  }
}