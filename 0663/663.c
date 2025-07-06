int equalTreePartition(struct TreeNode* root) {
    if (!root) return 0;
    int l = equalTreePartition(root->left);
    int r = equalTreePartition(root->right);
    return 1 + (l > r ? l : r);
}