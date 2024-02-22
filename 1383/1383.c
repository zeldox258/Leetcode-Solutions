int maximumPerformanceOfATeam(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumPerformanceOfATeam(root->left);
    int r = maximumPerformanceOfATeam(root->right);
    return 1 + (l > r ? l : r);
}