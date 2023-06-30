func maximumCoinsHeroesCanCollect(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumCoinsHeroesCanCollect(root.Left)
	r := maximumCoinsHeroesCanCollect(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}