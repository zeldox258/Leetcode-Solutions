int bagOfTokens(struct TreeNode* root) {
    if (!root) return 0;
    int l = bagOfTokens(root->left);
    int r = bagOfTokens(root->right);
    return 1 + (l > r ? l : r);
}