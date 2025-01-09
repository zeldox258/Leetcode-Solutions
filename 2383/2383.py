class Solution:
    def minimum_hours_of_training_to_win_a_compe(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]