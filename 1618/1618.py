class Solution:
    def maximum_font_to_fit_a_sentence_in_a_scre(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]