function timeNeededToBuyTickets(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(timeNeededToBuyTickets(root.left), timeNeededToBuyTickets(root.right));
}