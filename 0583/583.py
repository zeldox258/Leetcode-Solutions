class Solution:
    def delete_operation_for_two_strings(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]