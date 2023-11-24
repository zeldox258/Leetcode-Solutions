int uniquePathsIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = uniquePathsIi(root->left);
    int r = uniquePathsIi(root->right);
    return 1 + (l > r ? l : r);
}