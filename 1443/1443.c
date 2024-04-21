int minimumTimeToCollectAllApplesI(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumTimeToCollectAllApplesI(root->left);
    int r = minimumTimeToCollectAllApplesI(root->right);
    return 1 + (l > r ? l : r);
}