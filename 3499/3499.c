int maximizeActiveSectionWithTrade(int* nums, int numsSize) {
    int cur = nums[0], mx = nums[0];
    for (int i = 1; i < numsSize; i++) {
        cur = nums[i] > cur + nums[i] ? nums[i] : cur + nums[i];
        if (cur > mx) mx = cur;
    }
    return mx;
}