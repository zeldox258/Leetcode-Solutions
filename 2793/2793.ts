function statusOfFlightTickets(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(statusOfFlightTickets(root.left), statusOfFlightTickets(root.right));
}