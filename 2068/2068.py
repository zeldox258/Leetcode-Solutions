class Solution:
    def check_whether_two_strings_are_almost_equ(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]