class Solution:
    def flip_square_submatrix_vertically(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]