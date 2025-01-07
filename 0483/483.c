int smallestGoodBase(struct TreeNode* root) {
    if (!root) return 0;
    int l = smallestGoodBase(root->left);
    int r = smallestGoodBase(root->right);
    return 1 + (l > r ? l : r);
}