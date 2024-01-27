func splitTheArray(nums []int) int {
	l, r, res := 0, len(nums)-1, 0
	for l < r {
		area := min(nums[l], nums[r]) * (r - l)
		if area > res {
			res = area
		}
		if nums[l] < nums[r] {
			l++
		} else {
			r--
		}
	}
	return res
}