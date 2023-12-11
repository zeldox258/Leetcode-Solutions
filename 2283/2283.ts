function checkIfNumberHasEqualDigitCoun(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(checkIfNumberHasEqualDigitCoun(root.left), checkIfNumberHasEqualDigitCoun(root.right));
}