function smallestMissingNonnegativeInte(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(smallestMissingNonnegativeInte(root.left), smallestMissingNonnegativeInte(root.right));
}