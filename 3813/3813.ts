function vowelconsonantScore(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(vowelconsonantScore(root.left), vowelconsonantScore(root.right));
}