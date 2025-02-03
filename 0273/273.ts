function integerToEnglishWords(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(integerToEnglishWords(root.left), integerToEnglishWords(root.right));
}