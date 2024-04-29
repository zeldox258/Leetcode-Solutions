class Solution:
    def remove_all_ones_with_row_and_column_flip(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]