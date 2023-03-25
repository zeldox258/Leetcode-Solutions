int findTheNumberOfCopyArrays(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheNumberOfCopyArrays(root->left);
    int r = findTheNumberOfCopyArrays(root->right);
    return 1 + (l > r ? l : r);
}