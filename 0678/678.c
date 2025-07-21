int validParenthesisString(struct TreeNode* root) {
    if (!root) return 0;
    int l = validParenthesisString(root->left);
    int r = validParenthesisString(root->right);
    return 1 + (l > r ? l : r);
}