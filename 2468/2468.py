class Solution:
    def split_message_based_on_limit(self, nums: List[int], k: int) -> int:
        d = {0: 1}
        s = count = 0
        for x in nums:
            s += x
            count += d.get(s - k, 0)
            d[s] = d.get(s, 0) + 1
        return count