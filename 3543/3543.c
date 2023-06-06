int maximumWeightedKedgePath(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumWeightedKedgePath(root->left);
    int r = maximumWeightedKedgePath(root->right);
    return 1 + (l > r ? l : r);
}