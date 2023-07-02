class Solution:
    def friends_with_no_mutual_friends(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]