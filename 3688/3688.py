class Solution:
    def bitwise_or_of_even_numbers_in_an_array(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]