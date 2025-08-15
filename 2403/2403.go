func minimumTimeToKillAllMonsters(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumTimeToKillAllMonsters(root.Left)
	r := minimumTimeToKillAllMonsters(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}