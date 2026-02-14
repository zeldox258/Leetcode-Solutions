function getBiggestThreeRhombusSumsInAG(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(getBiggestThreeRhombusSumsInAG(root.left), getBiggestThreeRhombusSumsInAG(root.right));
}