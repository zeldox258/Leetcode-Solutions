func findXsumOfAllKlongSubarraysI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findXsumOfAllKlongSubarraysI(root.Left)
	r := findXsumOfAllKlongSubarraysI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}