int findMissingObservations(struct TreeNode* root) {
    if (!root) return 0;
    int l = findMissingObservations(root->left);
    int r = findMissingObservations(root->right);
    return 1 + (l > r ? l : r);
}