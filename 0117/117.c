int cmp(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}
int populatingNextRightPointersInE(int* nums, int numsSize, int k) {
    qsort(nums, numsSize, sizeof(int), cmp);
    return nums[numsSize - k];
}