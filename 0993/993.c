int cousinsInBinaryTree(struct TreeNode* root) {
    if (!root) return 0;
    int l = cousinsInBinaryTree(root->left);
    int r = cousinsInBinaryTree(root->right);
    return 1 + (l > r ? l : r);
}