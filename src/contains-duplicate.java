class Solution {
  public boolean containsDuplicate(int[] nums) {

    var set = new HashSet<Integer>();
    for( var num : nums) {
      if( !set.contains(num)){
        set.add(num);
      }else{
        return true;
      }
    }

    return false;

  }
}