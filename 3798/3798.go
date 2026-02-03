func largestEvenNumber(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := largestEvenNumber(root.Left)
	r := largestEvenNumber(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}