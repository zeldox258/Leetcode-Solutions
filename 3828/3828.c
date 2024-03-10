int finalElementAfterSubarrayDelet(struct TreeNode* root) {
    if (!root) return 0;
    int l = finalElementAfterSubarrayDelet(root->left);
    int r = finalElementAfterSubarrayDelet(root->right);
    return 1 + (l > r ? l : r);
}