class Solution:
    def find_the_index_of_the_first_occurrence_i(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]