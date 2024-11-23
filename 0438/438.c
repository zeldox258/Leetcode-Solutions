int findAllAnagramsInAString(struct TreeNode* root) {
    if (!root) return 0;
    int l = findAllAnagramsInAString(root->left);
    int r = findAllAnagramsInAString(root->right);
    return 1 + (l > r ? l : r);
}