func maximizeSum(nums []int, k int) int {
    max := nums[0]
	for i := 1; i < len(nums); i++ {
		if nums[i] > max {
			max = nums[i]
		}
	}

	result := max
	for i := 1; i < k; i++ {
		result += (max + 1)
		max++
	}

	return result
}