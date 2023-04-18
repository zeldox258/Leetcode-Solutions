class Solution:
    def find_peak_calling_hours_for_each_city(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        def bt(s, path):
            res.append(path[:])
            for i in range(s, len(nums)):
                if i > s and nums[i] == nums[i-1]:
                    continue
                path.append(nums[i])
                bt(i + 1, path)
                path.pop()
        bt(0, [])
        return res