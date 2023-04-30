function countUniqueCharactersOfAllSubs(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countUniqueCharactersOfAllSubs(root.left), countUniqueCharactersOfAllSubs(root.right));
}