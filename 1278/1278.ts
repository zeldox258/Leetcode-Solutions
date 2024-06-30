function palindromePartitioningIii(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(palindromePartitioningIii(root.left), palindromePartitioningIii(root.right));
}