class Solution:
    def all_paths_from_source_lead_to_destinatio(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count