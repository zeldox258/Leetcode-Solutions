function consecutiveAvailableSeats(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(consecutiveAvailableSeats(root.left), consecutiveAvailableSeats(root.right));
}