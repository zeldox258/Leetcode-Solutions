int maxChunksToMakeSortedIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = maxChunksToMakeSortedIi(root->left);
    int r = maxChunksToMakeSortedIi(root->right);
    return 1 + (l > r ? l : r);
}