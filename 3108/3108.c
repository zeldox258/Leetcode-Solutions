int minimumCostWalkInWeightedGraph(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumCostWalkInWeightedGraph(root->left);
    int r = minimumCostWalkInWeightedGraph(root->right);
    return 1 + (l > r ? l : r);
}