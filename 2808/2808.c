int minimumSecondsToEqualizeACircu(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumSecondsToEqualizeACircu(root->left);
    int r = minimumSecondsToEqualizeACircu(root->right);
    return 1 + (l > r ? l : r);
}