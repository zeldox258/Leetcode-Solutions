function maximumRepeatingSubstring(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumRepeatingSubstring(root.left), maximumRepeatingSubstring(root.right));
}