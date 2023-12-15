class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numList = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            if(numList.containsKey(target-nums[i]))
                return new int[] {i, numList.get(target - nums[i])};
            numList.put(nums[i],i);
            
        }
        return new int[2];
    }
}