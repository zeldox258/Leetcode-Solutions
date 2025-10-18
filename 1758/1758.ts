function minimumChangesToMakeAlternatin(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumChangesToMakeAlternatin(root.left), minimumChangesToMakeAlternatin(root.right));
}