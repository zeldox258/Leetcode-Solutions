function linkedListFrequency(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(linkedListFrequency(root.left), linkedListFrequency(root.right));
}