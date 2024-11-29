int maximumRepeatingSubstring(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumRepeatingSubstring(root->left);
    int r = maximumRepeatingSubstring(root->right);
    return 1 + (l > r ? l : r);
}