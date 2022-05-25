class Solution {
  int ans = 0;
  int tmp = 0;
  public int maxAreaOfIsland(int[][] grid) {
    for( int r = 0; r < grid.length; r++ ){
      for( int c = 0 ; c < grid[0].length ; c++){
        if( grid[r][c] == 1) {
          tmp = 0;
          remove(grid, r, c) ;
          ans = Math.max(ans,tmp);
        }
      }
    }
    return ans;
  }

  public void remove(int[][] grid, int r, int c){
    if( grid[r][c] == 1 ){
      grid[r][c] = 0;
      ++tmp;
      if( r-1>=0) remove(grid, r-1, c)  ;
      if(c-1 >=0) remove(grid, r, c-1);
      if(r+1 < grid.length) remove(grid, r+1,c);
      if(c+1< grid[0].length) remove(grid, r ,c+1);
    }
  }
}