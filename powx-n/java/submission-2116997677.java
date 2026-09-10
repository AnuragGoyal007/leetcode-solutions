class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            return 1.0/power(x,(long)-n);
        }
        return power(x,n);
    }

    private double power(double x, long n){
        if(n==0) return 1.0;
        if(n==1) return x;

        double half = power(x, n/2);

        if(n%2==0){
            return half*half; // Even case
        }
        return x * half * half; // Odd case
    }
}