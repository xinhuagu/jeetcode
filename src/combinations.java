class Solution {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();

    backtrack(result, temp, 1, k, n);
    return result;

  }

  public void backtrack(List<List<Integer>> result , List<Integer> tmp ,int start, int k, final int n){
    if( tmp.size() == k){
      result.add(new ArrayList<Integer>(tmp));
    }

    for( var i = start; i<= n; ++i ){
      tmp.add(i) ;
      backtrack(result, tmp, i+1, k, n);
      tmp.remove(tmp.size()-1);
    }
  }
}