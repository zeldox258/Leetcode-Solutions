function minimumLengthOfAnagramConcaten(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumLengthOfAnagramConcaten(root.left), minimumLengthOfAnagramConcaten(root.right));
}