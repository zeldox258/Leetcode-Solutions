class Solution:
    def remove_colored_pieces_if_both_neighbors_(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]