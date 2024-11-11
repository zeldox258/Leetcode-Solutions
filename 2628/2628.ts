function jsonDeepEqual(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(jsonDeepEqual(root.left), jsonDeepEqual(root.right));
}