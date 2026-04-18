int minimumCostToMakeArrayEqual(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumCostToMakeArrayEqual(root->left);
    int r = minimumCostToMakeArrayEqual(root->right);
    return 1 + (l > r ? l : r);
}