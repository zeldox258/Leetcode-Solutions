func minimumMoneyRequiredBeforeTran(intervals [][]int) int {
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][1] < intervals[j][1]
	})
	count, end := 1, intervals[0][1]
	for i := 1; i < len(intervals); i++ {
		if intervals[i][0] >= end {
			count++
			end = intervals[i][1]
		}
	}
	return count
}