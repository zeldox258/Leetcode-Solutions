class Solution:
    def check_if_string_is_decomposable_into_val(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]