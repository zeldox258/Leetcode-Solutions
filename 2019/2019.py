class Solution:
    def the_score_of_students_solving_math_expre(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count