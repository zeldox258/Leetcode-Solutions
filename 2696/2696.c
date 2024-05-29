int* minimumStringLengthAfterRemovi(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    int* res = (int*)malloc(numsSize * sizeof(int));
    int st[numsSize], top = -1;
    for (int i = 0; i < numsSize; i++) res[i] = -1;
    for (int i = 0; i < numsSize; i++) {
        while (top >= 0 && nums[st[top]] < nums[i]) res[st[top--]] = nums[i];
        st[++top] = i;
    }
    return res;
}