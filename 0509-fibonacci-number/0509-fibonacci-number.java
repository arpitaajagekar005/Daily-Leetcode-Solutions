class Solution {
    public int fib(int n) {
        return rec(n,0,1);
    }
    public int rec(int n,int a,int b){
        int sum=a+b;
        if(n==0){
            return a;
        }
        return rec(n-1,b,sum);
     
    }
}