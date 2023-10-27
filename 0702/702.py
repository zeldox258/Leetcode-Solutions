class Solution:
    def search_in_a_sorted_array_of_unknown_size(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: x[1])
        count, end = 1, intervals[0][1]
        for s, e in intervals[1:]:
            if s >= end:
                count += 1
                end = e
        return count