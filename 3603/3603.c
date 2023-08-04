int minimumCostPathWithAlternating(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumCostPathWithAlternating(root->left);
    int r = minimumCostPathWithAlternating(root->right);
    return 1 + (l > r ? l : r);
}