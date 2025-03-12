function findTheIndexOfTheLargeInteger(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheIndexOfTheLargeInteger(root.left), findTheIndexOfTheLargeInteger(root.right));
}