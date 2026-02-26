func findNthSmallestIntegerWithKOne(nums []int) []int {
	n := len(nums)
	res := make([]int, n)
	for i := range res {
		res[i] = -1
	}
	st := []int{}
	for i, x := range nums {
		for len(st) > 0 && nums[st[len(st)-1]] < x {
			res[st[len(st)-1]] = x
			st = st[:len(st)-1]
		}
		st = append(st, i)
	}
	return res
}