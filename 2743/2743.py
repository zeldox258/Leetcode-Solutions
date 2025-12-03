class Solution:
    def count_substrings_without_repeating_chara(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]