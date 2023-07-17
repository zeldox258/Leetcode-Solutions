class Solution:
    def suspicious_bank_accounts(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]