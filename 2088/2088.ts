function countFertilePyramidsInALand(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countFertilePyramidsInALand(root.left), countFertilePyramidsInALand(root.right));
}