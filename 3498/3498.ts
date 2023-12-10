function reverseDegreeOfAString(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(reverseDegreeOfAString(root.left), reverseDegreeOfAString(root.right));
}