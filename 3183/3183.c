int theNumberOfWaysToMakeTheSum(struct TreeNode* root) {
    if (!root) return 0;
    int l = theNumberOfWaysToMakeTheSum(root->left);
    int r = theNumberOfWaysToMakeTheSum(root->right);
    return 1 + (l > r ? l : r);
}