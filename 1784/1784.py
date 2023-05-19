class Solution:
    def check_if_binary_string_has_at_most_one_s(self, nums: List[int]) -> List[List[int]]:
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