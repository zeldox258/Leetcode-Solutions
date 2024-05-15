class Solution:
    def maximize_the_number_of_target_nodes_afte(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]