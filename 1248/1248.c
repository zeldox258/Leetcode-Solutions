int countNumberOfNiceSubarrays(struct TreeNode* root) {
    if (!root) return 0;
    int l = countNumberOfNiceSubarrays(root->left);
    int r = countNumberOfNiceSubarrays(root->right);
    return 1 + (l > r ? l : r);
}