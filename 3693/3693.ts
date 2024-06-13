function climbingStairsIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(climbingStairsIi(root.left), climbingStairsIi(root.right));
}