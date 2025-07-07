class Solution:
    def reverse_letters_then_special_characters_(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]