function distributeCandiesAmongChildren(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(distributeCandiesAmongChildren(root.left), distributeCandiesAmongChildren(root.right));
}