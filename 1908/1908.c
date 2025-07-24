int gameOfNim(struct TreeNode* root) {
    if (!root) return 0;
    int l = gameOfNim(root->left);
    int r = gameOfNim(root->right);
    return 1 + (l > r ? l : r);
}