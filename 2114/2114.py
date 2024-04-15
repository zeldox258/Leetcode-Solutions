class Solution:
    def maximum_number_of_words_found_in_sentenc(self, nums: List[int]) -> List[List[int]]:
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