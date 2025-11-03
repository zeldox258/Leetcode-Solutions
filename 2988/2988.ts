function managerOfTheLargestDepartment(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(managerOfTheLargestDepartment(root.left), managerOfTheLargestDepartment(root.right));
}