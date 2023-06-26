class Solution:
    def find_cumulative_salary_of_an_employee(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count