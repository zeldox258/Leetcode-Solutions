class Solution:
    def find_k_pairs_with_smallest_sums(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]