class Solution:
    def percentage_of_letter_in_string(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]