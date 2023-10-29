class Solution:
    def delete_duplicate_folders_in_system(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]