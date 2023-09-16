int findTheOriginalArrayOfPrefixXo(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheOriginalArrayOfPrefixXo(root->left);
    int r = findTheOriginalArrayOfPrefixXo(root->right);
    return 1 + (l > r ? l : r);
}