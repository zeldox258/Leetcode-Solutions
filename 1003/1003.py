class Solution:
    def check_if_word_is_valid_after_substitutio(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]