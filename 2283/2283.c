int checkIfNumberHasEqualDigitCoun(struct TreeNode* root) {
    if (!root) return 0;
    int l = checkIfNumberHasEqualDigitCoun(root->left);
    int r = checkIfNumberHasEqualDigitCoun(root->right);
    return 1 + (l > r ? l : r);
}