int constructStringWithMinimumCost(struct TreeNode* root) {
    if (!root) return 0;
    int l = constructStringWithMinimumCost(root->left);
    int r = constructStringWithMinimumCost(root->right);
    return 1 + (l > r ? l : r);
}