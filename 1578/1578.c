int minimumTimeToMakeRopeColorful(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumTimeToMakeRopeColorful(root->left);
    int r = minimumTimeToMakeRopeColorful(root->right);
    return 1 + (l > r ? l : r);
}