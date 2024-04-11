function minimumTimeToKillAllMonsters(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumTimeToKillAllMonsters(root.left), minimumTimeToKillAllMonsters(root.right));
}