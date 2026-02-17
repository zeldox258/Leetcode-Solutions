func smallestMissingNonnegativeInte(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := smallestMissingNonnegativeInte(root.Left)
	r := smallestMissingNonnegativeInte(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}