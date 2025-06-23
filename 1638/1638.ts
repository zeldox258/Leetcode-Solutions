function countSubstringsThatDifferByOne(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countSubstringsThatDifferByOne(root.left), countSubstringsThatDifferByOne(root.right));
}