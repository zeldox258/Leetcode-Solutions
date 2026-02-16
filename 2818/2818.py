class Solution:
    def apply_operations_to_maximize_score(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]