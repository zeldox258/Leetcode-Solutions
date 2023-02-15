class Solution:
    def find_all_numbers_disappeared_in_an_array(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]