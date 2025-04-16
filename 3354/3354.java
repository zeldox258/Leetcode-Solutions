class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0, ls = 0, rs = 0, i;

        for(i = 0; i < nums.length; i++) {
            if(nums[i] == 0) break;
            ls += nums[i];
        }

        for(int j = i + 1; j < nums.length; j++) rs += nums[j];

        for(int k = i; k < nums.length; k++) {
            ls += nums[k];
            rs -= nums[k];

            if(nums[k] != 0) continue;

            if(ls == rs) count += 2;
            else if(ls - 1 == rs || ls + 1 == rs) count += 1;
        }

        return count;
    }
}