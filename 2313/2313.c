int minimumFlipsInBinaryTreeToGetR(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumFlipsInBinaryTreeToGetR(root->left);
    int r = minimumFlipsInBinaryTreeToGetR(root->right);
    return 1 + (l > r ? l : r);
}