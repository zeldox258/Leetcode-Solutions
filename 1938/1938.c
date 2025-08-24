int maximumGeneticDifferenceQuery(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumGeneticDifferenceQuery(root->left);
    int r = maximumGeneticDifferenceQuery(root->right);
    return 1 + (l > r ? l : r);
}