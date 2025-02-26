class Solution:
    def find_smallest_common_element_in_all_rows(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]