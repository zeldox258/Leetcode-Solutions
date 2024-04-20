int maximumNumberOfFishInAGrid(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumNumberOfFishInAGrid(root->left);
    int r = maximumNumberOfFishInAGrid(root->right);
    return 1 + (l > r ? l : r);
}