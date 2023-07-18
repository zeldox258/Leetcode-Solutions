int largestLocalValuesInAMatrix(struct TreeNode* root) {
    if (!root) return 0;
    int l = largestLocalValuesInAMatrix(root->left);
    int r = largestLocalValuesInAMatrix(root->right);
    return 1 + (l > r ? l : r);
}