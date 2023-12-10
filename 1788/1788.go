func maximizeTheBeautyOfTheGarden(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximizeTheBeautyOfTheGarden(root.Left)
	r := maximizeTheBeautyOfTheGarden(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}