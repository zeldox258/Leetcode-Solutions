int removeSubfoldersFromTheFilesys(struct TreeNode* root) {
    if (!root) return 0;
    int l = removeSubfoldersFromTheFilesys(root->left);
    int r = removeSubfoldersFromTheFilesys(root->right);
    return 1 + (l > r ? l : r);
}