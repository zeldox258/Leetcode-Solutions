function sumOfImbalanceNumbersOfAllSuba(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfImbalanceNumbersOfAllSuba(root.left), sumOfImbalanceNumbersOfAllSuba(root.right));
}