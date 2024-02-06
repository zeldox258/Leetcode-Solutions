int kthLargestSumInABinaryTree(struct TreeNode* root) {
    if (!root) return 0;
    int l = kthLargestSumInABinaryTree(root->left);
    int r = kthLargestSumInABinaryTree(root->right);
    return 1 + (l > r ? l : r);
}