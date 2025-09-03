int accountsMerge(int* nums, int numsSize) {
    int l = 0, r = numsSize - 1, res = 0;
    while (l < r) {
        int area = (nums[l] < nums[r] ? nums[l] : nums[r]) * (r - l);
        if (area > res) res = area;
        if (nums[l] < nums[r]) l++; else r--;
    }
    return res;
}