function checkIfAllTheIntegersInARangeA(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(checkIfAllTheIntegersInARangeA(root.left), checkIfAllTheIntegersInARangeA(root.right));
}