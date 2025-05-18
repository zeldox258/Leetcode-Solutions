function kthSmallestElementInASortedMat(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(kthSmallestElementInASortedMat(root.left), kthSmallestElementInASortedMat(root.right));
}