int minimumDifferenceInSumsAfterRe(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumDifferenceInSumsAfterRe(root->left);
    int r = minimumDifferenceInSumsAfterRe(root->right);
    return 1 + (l > r ? l : r);
}