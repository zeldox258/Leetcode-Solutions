function minimumTimeToMakeRopeColorful(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumTimeToMakeRopeColorful(root.left), minimumTimeToMakeRopeColorful(root.right));
}