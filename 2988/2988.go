func managerOfTheLargestDepartment(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := managerOfTheLargestDepartment(root.Left)
	r := managerOfTheLargestDepartment(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}