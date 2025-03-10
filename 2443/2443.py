class Solution:
    def sum_of_number_and_its_reverse(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]