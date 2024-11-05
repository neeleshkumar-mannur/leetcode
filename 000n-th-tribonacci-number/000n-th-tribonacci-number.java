class Solution {
    public int tribonacci(int n) {
        int [] t = new int[n+1];
        for(int i = 0; i < t.length; i++){
            t[i] = -1;
        }
        return f(n, t);
    }
    
    private int f(int n, int [] t){
        if(n == 0){
            return 0;
        }
        
        if(n == 1 || n == 2){
            return 1;
        }
        if(t[n] != -1){
            return t[n];
        }
        else {
            t[n] = f(n-1, t) + f(n-2, t) + f(n-3, t);
        }
        return t[n];
    }
}