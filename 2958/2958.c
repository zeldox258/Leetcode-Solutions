int lengthOfLongestSubarrayWithAtM(struct TreeNode* root) {
    if (!root) return 0;
    int l = lengthOfLongestSubarrayWithAtM(root->left);
    int r = lengthOfLongestSubarrayWithAtM(root->right);
    return 1 + (l > r ? l : r);
}