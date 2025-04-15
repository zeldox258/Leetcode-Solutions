int maximumNumberOfRemovalQueriesT(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumNumberOfRemovalQueriesT(root->left);
    int r = maximumNumberOfRemovalQueriesT(root->right);
    return 1 + (l > r ? l : r);
}