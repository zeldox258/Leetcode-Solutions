function insertIntoASortedCircularLinke(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(insertIntoASortedCircularLinke(root.left), insertIntoASortedCircularLinke(root.right));
}