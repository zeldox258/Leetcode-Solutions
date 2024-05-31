class Solution:
    def count_beautiful_splits_in_an_array(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]