class Solution(object):
    def maximizeSum(self, nums, k):
        max_num = max(nums)
        result = max_num
        for i in range(1, k):
            result += (max_num + 1)
            max_num += 1
        return result
        