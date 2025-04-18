class Solution{
    public int countGoodNumbers(long n){
        long mod = 1000000007;
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = (Power(5, even, mod) * Power(4, odd, mod)) % mod;
        return (int) ans;
    }
    long Power(long base, long exp, long mod){
        long result = 1;
        base %= mod;
        while (exp > 0){
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
