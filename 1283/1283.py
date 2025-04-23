class Solution:
    def find_the_smallest_divisor_given_a_thresh(self, nums: List[int], k: int) -> int:
        d = {0: 1}
        s = count = 0
        for x in nums:
            s += x
            count += d.get(s - k, 0)
            d[s] = d.get(s, 0) + 1
        return count