class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] x:accounts){
            int sum = 0;
            for(int i:x){
                sum += i;
            }
            if(sum >= max) max = sum;
        }
        return max;
    }
}