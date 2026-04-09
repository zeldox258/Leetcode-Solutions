int countConnectedComponentsInLcmG(struct TreeNode* root) {
    if (!root) return 0;
    int l = countConnectedComponentsInLcmG(root->left);
    int r = countConnectedComponentsInLcmG(root->right);
    return 1 + (l > r ? l : r);
}