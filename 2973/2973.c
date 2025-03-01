int findNumberOfCoinsToPlaceInTree(struct TreeNode* root) {
    if (!root) return 0;
    int l = findNumberOfCoinsToPlaceInTree(root->left);
    int r = findNumberOfCoinsToPlaceInTree(root->right);
    return 1 + (l > r ? l : r);
}