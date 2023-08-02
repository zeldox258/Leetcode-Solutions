int changeNullValuesInATableToTheP(struct TreeNode* root) {
    if (!root) return 0;
    int l = changeNullValuesInATableToTheP(root->left);
    int r = changeNullValuesInATableToTheP(root->right);
    return 1 + (l > r ? l : r);
}