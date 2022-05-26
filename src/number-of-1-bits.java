public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    var st = Integer.toBinaryString(n);
    var arr = st.toCharArray();
    var res = 0;
    for(char ch : arr){
      if(ch=='1'){
        ++res;
      }
    }
    return res;
  }
}

  //better solution with O(1)

  public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
      sum++;
      n &= (n - 1);
    }
    return sum;
  }