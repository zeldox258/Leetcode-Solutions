function houseRobber(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(houseRobber(root.left), houseRobber(root.right));
}