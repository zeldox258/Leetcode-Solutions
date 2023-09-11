class Solution:
    def merge_triplets_to_form_target_triplet(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count