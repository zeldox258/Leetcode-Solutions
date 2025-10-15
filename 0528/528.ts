function randomPickWithWeight(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(randomPickWithWeight(root.left), randomPickWithWeight(root.right));
}