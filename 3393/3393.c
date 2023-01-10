int countPathsWithTheGivenXorValue(struct TreeNode* root) {
    if (!root) return 0;
    int l = countPathsWithTheGivenXorValue(root->left);
    int r = countPathsWithTheGivenXorValue(root->right);
    return 1 + (l > r ? l : r);
}