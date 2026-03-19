int maximumSumCircularSubarray(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumSumCircularSubarray(root->left);
    int r = maximumSumCircularSubarray(root->right);
    return 1 + (l > r ? l : r);
}