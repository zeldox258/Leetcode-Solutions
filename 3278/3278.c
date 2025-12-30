int findCandidatesForDataScientist(int* nums, int numsSize, int k) {
    int count = 0, sum = 0;
    int* map = (int*)calloc(20001, sizeof(int));
    map[10000] = 1;
    for (int i = 0; i < numsSize; i++) {
        sum += nums[i];
        if (sum - k + 10000 >= 0 && sum - k + 10000 < 20001)
            count += map[sum - k + 10000];
        map[sum + 10000]++;
    }
    free(map);
    return count;
}