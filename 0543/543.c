int diameterOfBinaryTree(struct TreeNode* root) {
    if (!root) return 0;
    int l = diameterOfBinaryTree(root->left);
    int r = diameterOfBinaryTree(root->right);
    return 1 + (l > r ? l : r);
}