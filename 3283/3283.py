class Solution:
    def maximum_number_of_moves_to_kill_all_pawn(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]