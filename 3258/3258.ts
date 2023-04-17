function countSubstringsThatSatisfyKcon(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countSubstringsThatSatisfyKcon(root.left), countSubstringsThatSatisfyKcon(root.right));
}