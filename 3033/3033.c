int modifyTheMatrix(struct TreeNode* root) {
    if (!root) return 0;
    int l = modifyTheMatrix(root->left);
    int r = modifyTheMatrix(root->right);
    return 1 + (l > r ? l : r);
}