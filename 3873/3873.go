func maximumPointsActivatedWithOneA(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumPointsActivatedWithOneA(root.Left)
	r := maximumPointsActivatedWithOneA(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}