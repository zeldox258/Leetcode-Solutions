class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(isprime(nums[i][i])) 
                max = Math.max(max,nums[i][i]);
            if(isprime(nums[nums.length-i-1][i]))    
                max = Math.max(max,nums[nums.length-i-1][i]);
        }
        return max;
    }
    boolean isprime(int n){
        if(n < 2)  return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) 
                return false;
        }
        return true;
    }
}