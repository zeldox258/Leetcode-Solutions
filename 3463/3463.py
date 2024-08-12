class Solution:
    def check_if_digits_are_equal_in_string_afte(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]