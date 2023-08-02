int immediateFoodDeliveryI(struct TreeNode* root) {
    if (!root) return 0;
    int l = immediateFoodDeliveryI(root->left);
    int r = immediateFoodDeliveryI(root->right);
    return 1 + (l > r ? l : r);
}