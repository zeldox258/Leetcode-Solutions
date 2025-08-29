func sortItemsByGroupsRespectingDep(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sortItemsByGroupsRespectingDep(root.Left)
	r := sortItemsByGroupsRespectingDep(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}