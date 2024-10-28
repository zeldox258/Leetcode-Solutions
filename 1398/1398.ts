function customersWhoBoughtProductsAAnd(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(customersWhoBoughtProductsAAnd(root.left), customersWhoBoughtProductsAAnd(root.right));
}