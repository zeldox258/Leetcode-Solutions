class Solution {
    private int semiOrder(int[] nums, int count) {
        int length = nums.length;
        if (nums[0] == 1 && nums[length - 1] == length) {
            return count;
        }
        
        if (nums[0] == 1) {
            for (int i = 0; i < length - 1; i++) {
                if (nums[i] == length) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = length;
                    break;
                }
            }
        } else {
            for (int i = 1; i < length; i++) {
                if (nums[i] == 1) {
                    nums[i] = nums[i - 1];
                    nums[i - 1] = 1;
                    break;
                }
            }
        }
        return semiOrder(nums, count + 1);
    }

    public int semiOrderedPermutation(int[] nums) {
        return semiOrder(nums, 0);
    }
}
