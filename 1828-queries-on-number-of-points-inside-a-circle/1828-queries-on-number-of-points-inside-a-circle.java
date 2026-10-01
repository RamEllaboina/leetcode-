class Solution {
    public boolean eulidean(int[] p , int[] q){
        int x = Math.abs(p[0]-q[0]);
        x = x*x;
        int y = Math.abs(p[1] - q[1]);
        y = y*y;
        int dis = x+y;
        return (dis <= q[2]*q[2]);
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i = 0; i <queries.length;i++){
            for(int[] x:points){
                if(eulidean(x,queries[i])) arr[i]++;
            }
        }
        return arr;
    }
}