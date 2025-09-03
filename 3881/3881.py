class Solution:
    def direction_assignments_with_exactly_k_vis(self, nums: List[int]) -> List[int]:
        res, st = [-1] * len(nums), []
        for i, x in enumerate(nums):
            while st and nums[st[-1]] < x:
                res[st.pop()] = x
            st.append(i)
        return res