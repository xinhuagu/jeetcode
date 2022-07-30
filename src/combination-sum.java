class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();
    backtrack(result, tmp, 0, candidates, target);
    return result;
  }

  public void  backtrack(List<List<Integer>> result, List<Integer> tmp, int start, final int[] can , int target){
    if( target == 0 ) {
      result.add( new ArrayList<Integer>(tmp));
      return;
    }else if( target <0){
      return;
    }

    for( var i = start; i < can.length ; ++i ){
      tmp.add(can[i]);
      backtrack(result, tmp, i , can, target-can[i]);
      tmp.remove(tmp.size()-1);
    }
  }
}