int sumOfScoresOfBuiltStrings(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfScoresOfBuiltStrings(root->left);
    int r = sumOfScoresOfBuiltStrings(root->right);
    return 1 + (l > r ? l : r);
}