int findValidPairOfAdjacentDigitsI(struct TreeNode* root) {
    if (!root) return 0;
    int l = findValidPairOfAdjacentDigitsI(root->left);
    int r = findValidPairOfAdjacentDigitsI(root->right);
    return 1 + (l > r ? l : r);
}