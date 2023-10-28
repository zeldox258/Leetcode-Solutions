function numberOfTimesADriverWasAPassen(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfTimesADriverWasAPassen(root.left), numberOfTimesADriverWasAPassen(root.right));
}