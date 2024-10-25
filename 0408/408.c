int validWordAbbreviation(struct TreeNode* root) {
    if (!root) return 0;
    int l = validWordAbbreviation(root->left);
    int r = validWordAbbreviation(root->right);
    return 1 + (l > r ? l : r);
}