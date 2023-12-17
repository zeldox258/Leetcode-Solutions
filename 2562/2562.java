class Solution {
    public long findTheArrayConcVal(int[] nums) {

        int low = 0 , high = nums.length-1; long ans = 0L;
        StringBuilder temp = new StringBuilder();

        while(low<=high){
            if(low!=high) temp.append(nums[low]).append(nums[high]);
            else temp.append(nums[low]);
            low++; high--;
            ans+=(Integer.parseInt(temp.toString()));
            temp.setLength(0);
        }
        
        return ans;

    }
}