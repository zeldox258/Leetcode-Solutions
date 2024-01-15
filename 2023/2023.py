class Solution:
    def number_of_pairs_of_strings_with_concaten(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]