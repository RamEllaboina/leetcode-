class Solution {
    public int counter(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '1') count++;
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            arr[i] = counter(bank[i]);
        }
        int count = 0;
        for(int x:arr){
            if(x == 0) count++;
        }
        if(count >= arr.length-1) return 0;
        int ans = 0;
        int x = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                if(x != 0){
                    ans = ans + arr[i] * x;
                }
             x = arr[i];
            }
           
        }
        return ans;
    }
}