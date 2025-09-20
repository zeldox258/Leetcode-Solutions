class Solution:
    def find_the_degree_of_each_vertex(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]