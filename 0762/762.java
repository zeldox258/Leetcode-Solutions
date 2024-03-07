
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        Set<Integer> primes = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        for (int i = left; i <= right; i++) if (primes.contains(Integer.bitCount(i))) res++;
        return res;
    }
}
