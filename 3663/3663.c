int findTheLeastFrequentDigit(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheLeastFrequentDigit(root->left);
    int r = findTheLeastFrequentDigit(root->right);
    return 1 + (l > r ? l : r);
}