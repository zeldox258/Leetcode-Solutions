int differenceBetweenMaximumAndMin(struct TreeNode* root) {
    if (!root) return 0;
    int l = differenceBetweenMaximumAndMin(root->left);
    int r = differenceBetweenMaximumAndMin(root->right);
    return 1 + (l > r ? l : r);
}