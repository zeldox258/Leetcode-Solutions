class Solution {
    public long countFairPairs(int[] arr, int lower, int upper) {
        Arrays.sort(arr);

        return finpPairsWithSumSmallerThanK(arr, upper) - finpPairsWithSumSmallerThanK(arr, lower - 1);
    }
    public long finpPairsWithSumSmallerThanK(int[] arr, int k){
        int i = 0;
        int j = arr.length - 1;
        long ans = 0;

        while(i < j){
            if(arr[i] + arr[j] > k) j--;
            else {
                ans = ans + (long)(j-i);
                i++;
            }
        }
        return ans;
    }
}