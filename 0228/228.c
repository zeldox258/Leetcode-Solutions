int summaryRanges(struct TreeNode* root) {
    if (!root) return 0;
    int l = summaryRanges(root->left);
    int r = summaryRanges(root->right);
    return 1 + (l > r ? l : r);
}