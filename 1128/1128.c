int numberOfEquivalentDominoPairs(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfEquivalentDominoPairs(root->left);
    int r = numberOfEquivalentDominoPairs(root->right);
    return 1 + (l > r ? l : r);
}