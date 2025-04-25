int minimumAbsoluteSumDifference(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumAbsoluteSumDifference(root->left);
    int r = minimumAbsoluteSumDifference(root->right);
    return 1 + (l > r ? l : r);
}