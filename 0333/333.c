int largestBstSubtree(struct TreeNode* root) {
    if (!root) return 0;
    int l = largestBstSubtree(root->left);
    int r = largestBstSubtree(root->right);
    return 1 + (l > r ? l : r);
}