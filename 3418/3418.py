class Solution:
    def maximum_amount_of_money_robot_can_earn(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]