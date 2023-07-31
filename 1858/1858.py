class Solution:
    def longest_word_with_all_prefixes(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]