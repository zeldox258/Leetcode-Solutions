class Solution:
    def find_the_punishment_number_of_an_integer(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]