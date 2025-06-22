class Solution:
    def find_emotionally_consistent_users(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]