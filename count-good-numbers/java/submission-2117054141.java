class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = power(5, even);
        ans = (ans * power(4, odd)) % MOD;

        return (int) ans;
    }

    private long power(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);

        if (n % 2 == 0) {
            return (half * half) % MOD;
        }

        return (x * half % MOD * half) % MOD;
    }
}