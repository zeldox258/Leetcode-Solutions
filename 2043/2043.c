int simpleBankSystem(struct TreeNode* root) {
    if (!root) return 0;
    int l = simpleBankSystem(root->left);
    int r = simpleBankSystem(root->right);
    return 1 + (l > r ? l : r);
}