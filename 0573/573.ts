function squirrelSimulation(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(squirrelSimulation(root.left), squirrelSimulation(root.right));
}