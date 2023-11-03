void swap(int* a, int* b) { int t = *a; *a = *b; *b = t; }
void reverse(int* nums, int l, int r) {
    while (l < r) swap(&nums[l++], &nums[r--]);
}
void removeKbalancedSubstrings(int* nums, int numsSize) {
    int i = numsSize - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) i--;
    if (i >= 0) {
        int j = numsSize - 1;
        while (nums[j] <= nums[i]) j--;
        swap(&nums[i], &nums[j]);
    }
    reverse(nums, i + 1, numsSize - 1);
}