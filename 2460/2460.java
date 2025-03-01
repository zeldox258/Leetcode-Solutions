class Solution {
    public int[] applyOperations(int[] nums) {
        int[] newNums = new int[nums.length];
        int count = 0;
        int i;
        for (i = 0; i < nums.length - 1; i++){
            if (nums[i] != 0) {
                if (nums[i] == nums[i+1]){
                    newNums[count] = nums[i] * 2;
                    i++;
                }
                else newNums[count] = nums[i];
                count++;
            }
        }
        if (i != nums.length) newNums[count] = nums[nums.length-1];
        return newNums;
    }
}