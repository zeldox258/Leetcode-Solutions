function findTheOccurrenceOfFirstAlmost(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheOccurrenceOfFirstAlmost(root.left), findTheOccurrenceOfFirstAlmost(root.right));
}