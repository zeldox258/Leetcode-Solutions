class Solution:
    def smallest_string_with_a_given_numeric_val(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]