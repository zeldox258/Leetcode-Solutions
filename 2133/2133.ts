function checkIfEveryRowAndColumnContai(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(checkIfEveryRowAndColumnContai(root.left), checkIfEveryRowAndColumnContai(root.right));
}