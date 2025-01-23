func longestSubsequenceWithDecreasi(nums []int) int {
	cur, mx := nums[0], nums[0]
	for _, x := range nums[1:] {
		if x > cur+x {
			cur = x
		} else {
			cur = cur + x
		}
		if cur > mx {
			mx = cur
		}
	}
	return mx
}