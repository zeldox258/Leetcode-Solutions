class Solution:
    def knight_probability_in_chessboard(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]