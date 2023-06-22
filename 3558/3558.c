int numberOfWaysToAssignEdgeWeight(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfWaysToAssignEdgeWeight(root->left);
    int r = numberOfWaysToAssignEdgeWeight(root->right);
    return 1 + (l > r ? l : r);
}