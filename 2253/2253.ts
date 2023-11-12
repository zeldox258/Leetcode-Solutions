function dynamicUnpivotingOfATable(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(dynamicUnpivotingOfATable(root.left), dynamicUnpivotingOfATable(root.right));
}