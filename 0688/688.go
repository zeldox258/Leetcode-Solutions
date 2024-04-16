func knightProbabilityInChessboard(nums []int, k int) int {
	sort.Ints(nums)
	return nums[len(nums)-k]
}