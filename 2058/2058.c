int findTheMinimumAndMaximumNumber(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheMinimumAndMaximumNumber(root->left);
    int r = findTheMinimumAndMaximumNumber(root->right);
    return 1 + (l > r ? l : r);
}