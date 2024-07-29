function closestPrimeNumbersInRange(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(closestPrimeNumbersInRange(root.left), closestPrimeNumbersInRange(root.right));
}