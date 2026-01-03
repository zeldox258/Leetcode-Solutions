class Solution:
    def height_of_special_binary_tree(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]