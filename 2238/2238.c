int numberOfTimesADriverWasAPassen(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfTimesADriverWasAPassen(root->left);
    int r = numberOfTimesADriverWasAPassen(root->right);
    return 1 + (l > r ? l : r);
}