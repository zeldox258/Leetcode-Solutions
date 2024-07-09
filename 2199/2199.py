class Solution:
    def finding_the_topic_of_each_post(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count