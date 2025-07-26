class Solution:
    def replace_employee_id_with_the_unique_iden(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]