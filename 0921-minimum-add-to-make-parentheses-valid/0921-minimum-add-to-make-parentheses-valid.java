class Solution {
    public int minAddToMakeValid(String s) {
        int top = -1;
        char[] arr = new char[s.length()];
        int open = 0 , close = 0;
        for(char c:s.toCharArray()){
            if(c == '('){
                open++;
                arr[++top] = c;
            }
            else if(c == ')'){
                if(top == -1) close++;
                else if(arr[top] != '(') close++;
                else{
                    open--;
                    top--;
                }
            }
        }
        return (open+close);
    }
}