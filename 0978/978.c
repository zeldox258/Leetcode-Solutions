int longestTurbulentSubarray(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestTurbulentSubarray(root->left);
    int r = longestTurbulentSubarray(root->right);
    return 1 + (l > r ? l : r);
}