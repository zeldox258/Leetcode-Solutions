int minimumNumberOfKeypresses(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumNumberOfKeypresses(root->left);
    int r = minimumNumberOfKeypresses(root->right);
    return 1 + (l > r ? l : r);
}