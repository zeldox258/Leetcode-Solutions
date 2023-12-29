function tasksCountInTheWeekend(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(tasksCountInTheWeekend(root.left), tasksCountInTheWeekend(root.right));
}