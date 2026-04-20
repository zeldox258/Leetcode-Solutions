int longestSubstringWithoutRepeati(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestSubstringWithoutRepeati(root->left);
    int r = longestSubstringWithoutRepeati(root->right);
    return 1 + (l > r ? l : r);
}