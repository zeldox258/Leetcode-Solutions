class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         return Math.min(k, Math.min(numOnes, 2*numOnes+numZeros-k)); 
    }
}