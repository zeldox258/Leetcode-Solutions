int sumOfDigitDifferencesOfAllPair(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfDigitDifferencesOfAllPair(root->left);
    int r = sumOfDigitDifferencesOfAllPair(root->right);
    return 1 + (l > r ? l : r);
}