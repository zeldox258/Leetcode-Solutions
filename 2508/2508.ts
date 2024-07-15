function addEdgesToMakeDegreesOfAllNode(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(addEdgesToMakeDegreesOfAllNode(root.left), addEdgesToMakeDegreesOfAllNode(root.right));
}