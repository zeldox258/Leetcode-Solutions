class Solution:
    def find_the_number_of_winning_players(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]