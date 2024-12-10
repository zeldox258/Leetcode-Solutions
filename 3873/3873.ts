function maximumPointsActivatedWithOneA(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumPointsActivatedWithOneA(root.left), maximumPointsActivatedWithOneA(root.right));
}