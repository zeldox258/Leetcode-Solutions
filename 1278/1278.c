int palindromePartitioningIii(struct TreeNode* root) {
    if (!root) return 0;
    int l = palindromePartitioningIii(root->left);
    int r = palindromePartitioningIii(root->right);
    return 1 + (l > r ? l : r);
}