int designTictactoe(struct TreeNode* root) {
    if (!root) return 0;
    int l = designTictactoe(root->left);
    int r = designTictactoe(root->right);
    return 1 + (l > r ? l : r);
}