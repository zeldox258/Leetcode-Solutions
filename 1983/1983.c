int widestPairOfIndicesWithEqualRa(struct TreeNode* root) {
    if (!root) return 0;
    int l = widestPairOfIndicesWithEqualRa(root->left);
    int r = widestPairOfIndicesWithEqualRa(root->right);
    return 1 + (l > r ? l : r);
}