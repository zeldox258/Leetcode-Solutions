int numberOfDistinctSubstringsInAS(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfDistinctSubstringsInAS(root->left);
    int r = numberOfDistinctSubstringsInAS(root->right);
    return 1 + (l > r ? l : r);
}