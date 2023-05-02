function minimumAmountOfDamageDealtToBo(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumAmountOfDamageDealtToBo(root.left), minimumAmountOfDamageDealtToBo(root.right));
}