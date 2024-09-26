function largestEvenNumber(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(largestEvenNumber(root.left), largestEvenNumber(root.right));
}