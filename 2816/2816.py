class Solution:
    def double_a_number_represented_as_a_linked_(self, nums: List[int]) -> List[int]:
        res, st = [-1] * len(nums), []
        for i, x in enumerate(nums):
            while st and nums[st[-1]] < x:
                res[st.pop()] = x
            st.append(i)
        return res