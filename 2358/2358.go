func maximumNumberOfGroupsEnteringA(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumNumberOfGroupsEnteringA(root.Left)
	r := maximumNumberOfGroupsEnteringA(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}