class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    var rows = matrix.length;
    var cols = matrix[0].length;
    var idx = rows-1;

    if(matrix[0][0]>target){
      return false;
    }

    for(int i = 1; i< rows; i++){
      if(matrix[i][0] == target){
        return true;
      }
      if( matrix[i][0]>target ){
        idx = i-1;
        break;
      }
    }


    for(int j = 0; j<cols; j++){
      if(matrix[idx][j] == target){
        return true;
      }
    }

    return false;

  }
}