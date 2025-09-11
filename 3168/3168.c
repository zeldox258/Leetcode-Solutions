int minimumNumberOfChairsInAWaitin(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumNumberOfChairsInAWaitin(root->left);
    int r = minimumNumberOfChairsInAWaitin(root->right);
    return 1 + (l > r ? l : r);
}