class Solution:
    def subsequence_of_size_k_with_the_largest_e(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]