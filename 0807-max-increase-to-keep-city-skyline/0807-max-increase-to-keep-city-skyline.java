class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowheight = new int[grid.length];
        int count = 0;
        int[] colheight = new int[grid[0].length];
        int index1 = 0;
        for(int[] x:grid){
            int max = x[0];
            for(int i:x){
                if(i>max) max = i;
            }
            rowheight[index1++] = max;
        }
        for(int i=0;i<grid.length;i++){
            int max = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[j][i] > max) max = grid[j][i];
            }
            colheight[i] = max;
        }
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int k =  Math.min(rowheight[i],colheight[j]);
                if(k > grid[i][j]) count += (k-grid[i][j]);
            }
        }
        return count;
    }
}