class Solution {
    public int minimumPairRemoval(int[] nums) {
        int length = nums.length - 1;
        int count = 0;

        while(length > 0) {
            boolean increase = true;
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int i = 0; i < length; i++) {
                if(nums[i] > nums[i + 1]) increase = false;
                if(nums[i] + nums[i + 1] < minSum) {
                    minSum = nums[i] + nums[i + 1];
                    minIndex = i;
                }
            }

            if(increase) break;
            nums[minIndex] = minSum;
            for(int i = minIndex + 1; i < length; i++) nums[i] = nums[i + 1];

            length--;
            count++;
        }
        return count;
    }
}