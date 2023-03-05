int constructBinarySearchTreeFromP(struct TreeNode* root) {
    if (!root) return 0;
    int l = constructBinarySearchTreeFromP(root->left);
    int r = constructBinarySearchTreeFromP(root->right);
    return 1 + (l > r ? l : r);
}