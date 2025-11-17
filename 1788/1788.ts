function maximizeTheBeautyOfTheGarden(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximizeTheBeautyOfTheGarden(root.left), maximizeTheBeautyOfTheGarden(root.right));
}