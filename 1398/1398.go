func customersWhoBoughtProductsAAnd(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := customersWhoBoughtProductsAAnd(root.Left)
	r := customersWhoBoughtProductsAAnd(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}