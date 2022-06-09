class Solution {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    var queue = new ArrayDeque<Integer>();

    var rows = mat.length;
    var cols = mat[0].length;
    var total = rows * cols;

    if( r*c != total){
      return mat;
    }

    var new_rows = r;
    var new_cols = c;
    int[][] new_mat = new int[r][c];

    for( int i = 0 ; i < rows ; i ++){
      for(int j = 0; j<cols; j++){
        queue.add(mat[i][j]);
        System.out.println("add " + mat[i][j]);
      }
    }

    for( int n = 0; n <new_rows; n++){
      for(int m = 0; m< new_cols; m++){
        new_mat[n][m] = queue.pop();
      }
    }

    return new_mat;
  }
}