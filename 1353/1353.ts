function maximumNumberOfEventsThatCanBe(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfEventsThatCanBe(root.left), maximumNumberOfEventsThatCanBe(root.right));
}