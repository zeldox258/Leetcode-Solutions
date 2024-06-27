int uniqueWordAbbreviation(struct TreeNode* root) {
    if (!root) return 0;
    int l = uniqueWordAbbreviation(root->left);
    int r = uniqueWordAbbreviation(root->right);
    return 1 + (l > r ? l : r);
}