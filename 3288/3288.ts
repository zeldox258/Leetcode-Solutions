function lengthOfTheLongestIncreasingPa(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(lengthOfTheLongestIncreasingPa(root.left), lengthOfTheLongestIncreasingPa(root.right));
}