class Solution:
    def number_of_ways_to_split_a_string(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]