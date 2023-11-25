function unique3digitEvenNumbers(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(unique3digitEvenNumbers(root.left), unique3digitEvenNumbers(root.right));
}