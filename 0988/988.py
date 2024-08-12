class Solution:
    def smallest_string_starting_from_leaf(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]