function runningTotalForDifferentGender(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(runningTotalForDifferentGender(root.left), runningTotalForDifferentGender(root.right));
}