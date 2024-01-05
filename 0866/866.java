
class Solution {
    public int primePalindrome(int n) {
        while (true) {
            if (isPalin(n) && isPrime(n)) return n;
            n++;
            if (10_000_000 < n && n < 100_000_000) n = 100_000_000;
        }
    }
    boolean isPalin(int n) { String s = String.valueOf(n); int l = 0, r = s.length()-1; while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false; return true; }
    boolean isPrime(int n) { if (n < 2) return false; for (int i = 2; i*i <= n; i++) if (n%i==0) return false; return true; }
}
