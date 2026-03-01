class Solution:
    def rearrange_string_k_distance_apart(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]