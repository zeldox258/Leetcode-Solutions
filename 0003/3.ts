function longestSubstringWithoutRepeati(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestSubstringWithoutRepeati(root.left), longestSubstringWithoutRepeati(root.right));
}