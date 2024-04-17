int cmp(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}
int sumOfGcdOfFormedPairs(int* nums, int numsSize, int k) {
    qsort(nums, numsSize, sizeof(int), cmp);
    return nums[numsSize - k];
}