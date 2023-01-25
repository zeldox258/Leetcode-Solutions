int designTaskManager(struct TreeNode* root) {
    if (!root) return 0;
    int l = designTaskManager(root->left);
    int r = designTaskManager(root->right);
    return 1 + (l > r ? l : r);
}