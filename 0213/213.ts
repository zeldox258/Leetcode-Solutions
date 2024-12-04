function houseRobberIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(houseRobberIi(root.left), houseRobberIi(root.right));
}