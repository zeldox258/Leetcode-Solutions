class Solution:
    def generate_random_point_in_a_circle(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]