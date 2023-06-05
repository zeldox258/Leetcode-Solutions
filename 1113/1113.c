int reportedPosts(struct TreeNode* root) {
    if (!root) return 0;
    int l = reportedPosts(root->left);
    int r = reportedPosts(root->right);
    return 1 + (l > r ? l : r);
}