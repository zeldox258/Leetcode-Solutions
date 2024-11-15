int theWordingGame(struct TreeNode* root) {
    if (!root) return 0;
    int l = theWordingGame(root->left);
    int r = theWordingGame(root->right);
    return 1 + (l > r ? l : r);
}