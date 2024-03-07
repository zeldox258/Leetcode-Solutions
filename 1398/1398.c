int customersWhoBoughtProductsAAnd(struct TreeNode* root) {
    if (!root) return 0;
    int l = customersWhoBoughtProductsAAnd(root->left);
    int r = customersWhoBoughtProductsAAnd(root->right);
    return 1 + (l > r ? l : r);
}