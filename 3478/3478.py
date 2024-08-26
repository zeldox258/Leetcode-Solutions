class Solution:
    def choose_k_elements_with_maximum_sum(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]