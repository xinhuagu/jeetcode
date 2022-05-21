/**
 * use map , like twoSum O(n)
 *
 * class Solution {
 *     public int[] twoSum(int[] numbers, int target) {
 *         var map = new HashMap<Integer,Integer>();
 *         var len = numbers.length;
 *         var res = new int[2];
 *
 *         for( int i =0; i < len ; i++){
 *             if( !map.containsKey(numbers[i])){
 *                 map.put(target-numbers[i],i);
 *             }else{
 *                 res[0] = map.get(numbers[i])+1;
 *                 res[1] = i +1;
 *                 return res;
 *             }
 *         }
 *         return res;;
 *     }
 * }
 */

class Solution {
  public int[] twoSum(int[] numbers, int target) {
    var left = 0;
    var right = numbers.length-1;
    var res = new int[2];

    while( left <= right){
      var sum = numbers[left] + numbers[right];
      if( sum == target){
        res[0] = left+1;
        res[1] = right +1;
        return res;
      }else if( sum < target ){
        left++;
      }else{
        right--;
      }
    }

    return res;
  }
}