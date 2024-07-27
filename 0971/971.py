class Solution:
    def flip_binary_tree_to_match_preorder_trave(self, nums: List[int]) -> List[int]:
        res, st = [-1] * len(nums), []
        for i, x in enumerate(nums):
            while st and nums[st[-1]] < x:
                res[st.pop()] = x
            st.append(i)
        return res