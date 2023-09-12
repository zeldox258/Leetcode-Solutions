function minimumNumberOfMovesToMakePali(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumNumberOfMovesToMakePali(root.left), minimumNumberOfMovesToMakePali(root.right));
}