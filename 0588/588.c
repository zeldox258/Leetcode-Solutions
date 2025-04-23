int designInmemoryFileSystem(struct TreeNode* root) {
    if (!root) return 0;
    int l = designInmemoryFileSystem(root->left);
    int r = designInmemoryFileSystem(root->right);
    return 1 + (l > r ? l : r);
}