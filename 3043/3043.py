class Solution:
    def find_the_length_of_the_longest_common_pr(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]