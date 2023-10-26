class Solution:
    def number_of_visible_people_in_a_queue(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count