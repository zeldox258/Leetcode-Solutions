class Solution:
    def find_the_child_who_has_the_ball_after_k_(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]