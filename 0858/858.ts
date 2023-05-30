function mirrorReflection(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(mirrorReflection(root.left), mirrorReflection(root.right));
}