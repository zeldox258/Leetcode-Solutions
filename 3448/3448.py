class Solution:
    def count_substrings_divisible_by_last_digit(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]