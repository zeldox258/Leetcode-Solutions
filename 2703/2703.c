int returnLengthOfArgumentsPassed(struct TreeNode* root) {
    if (!root) return 0;
    int l = returnLengthOfArgumentsPassed(root->left);
    int r = returnLengthOfArgumentsPassed(root->right);
    return 1 + (l > r ? l : r);
}