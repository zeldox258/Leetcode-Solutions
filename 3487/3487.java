class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int sum = 0;
        int max = nums[0];

        for(int n : nums){
            if(n>0 && !map.contains(n)){
                map.add(n);
                sum=sum+n;
            }
            if(n>max){
                max = n;
            }
        }

        if(sum==0){
            return max;
        }
        return sum;
    }
}