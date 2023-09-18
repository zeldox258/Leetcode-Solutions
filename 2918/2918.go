func minimumEqualSumOfTwoArraysAfte(nums []int, k int) int {
	m := map[int]int{0: 1}
	sum, count := 0, 0
	for _, x := range nums {
		sum += x
		count += m[sum-k]
		m[sum]++
	}
	return count
}