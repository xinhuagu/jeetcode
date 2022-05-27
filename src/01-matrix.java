class Solution {
  public int[][] updateMatrix(int[][] mat) {
    var rows = mat.length;
    var cols = mat[0].length;

    var dist = new int[rows][cols];
    for( int i = 0; i< rows; i++){
      for( int j =0; j<cols; j++){
        dist[i][j] = rows+cols;
      }
    }

    for( int i = 0; i<rows; i++){
      for(int j=0; j<cols; j++){
        if(mat[i][j] == 0 ){
          dist[i][j] = 0;
        }else{
          if( i-1>=0){
            dist[i][j] = Math.min(dist[i][j], dist[i-1][j] +1 );
          }
          if( j-1>=0){
            dist[i][j] = Math.min(dist[i][j], dist[i][j-1] +1 );
          }

        }
      }
    }

    for ( int i = rows-1; i>=0; i--){
      for(int j = cols-1; j>=0; j--){
        if(i+1<rows){
          dist[i][j] = Math.min(dist[i][j], dist[i+1][j] +1 );
        }
        if(j+1<cols){
          dist[i][j] = Math.min(dist[i][j], dist[i][j+1] +1 );
        }
      }
    }

    return dist;


  }

}