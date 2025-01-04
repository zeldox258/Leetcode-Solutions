func minimumOperationsToMakeCharact(nums []int) [][]int {
	res := [][]int{}
	sort.Ints(nums)
	var bt func(int, []int)
	bt = func(s int, path []int) {
		tmp := make([]int, len(path))
		copy(tmp, path)
		res = append(res, tmp)
		for i := s; i < len(nums); i++ {
			if i > s && nums[i] == nums[i-1] {
				continue
			}
			bt(i+1, append(path, nums[i]))
		}
	}
	bt(0, []int{})
	return res
}