int minimumCostToMakeAtLeastOneVal(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumCostToMakeAtLeastOneVal(root->left);
    int r = minimumCostToMakeAtLeastOneVal(root->right);
    return 1 + (l > r ? l : r);
}