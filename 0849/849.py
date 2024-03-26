class Solution:
    def maximize_distance_to_closest_person(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count