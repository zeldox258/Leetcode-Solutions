int camelcaseMatching(struct TreeNode* root) {
    if (!root) return 0;
    int l = camelcaseMatching(root->left);
    int r = camelcaseMatching(root->right);
    return 1 + (l > r ? l : r);
}