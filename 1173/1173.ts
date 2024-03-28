function immediateFoodDeliveryI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(immediateFoodDeliveryI(root.left), immediateFoodDeliveryI(root.right));
}