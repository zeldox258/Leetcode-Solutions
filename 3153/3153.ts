function sumOfDigitDifferencesOfAllPair(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfDigitDifferencesOfAllPair(root.left), sumOfDigitDifferencesOfAllPair(root.right));
}