int minimumImpossibleOr(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumImpossibleOr(root->left);
    int r = minimumImpossibleOr(root->right);
    return 1 + (l > r ? l : r);
}