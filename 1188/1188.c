int designBoundedBlockingQueue(struct TreeNode* root) {
    if (!root) return 0;
    int l = designBoundedBlockingQueue(root->left);
    int r = designBoundedBlockingQueue(root->right);
    return 1 + (l > r ? l : r);
}