function findTheMaximumNumberOfFruitsCo(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheMaximumNumberOfFruitsCo(root.left), findTheMaximumNumberOfFruitsCo(root.right));
}