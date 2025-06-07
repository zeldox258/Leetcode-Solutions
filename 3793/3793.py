class Solution:
    def find_users_with_high_token_usage(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]