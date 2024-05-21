int paintHouseIii(struct TreeNode* root) {
    if (!root) return 0;
    int l = paintHouseIii(root->left);
    int r = paintHouseIii(root->right);
    return 1 + (l > r ? l : r);
}