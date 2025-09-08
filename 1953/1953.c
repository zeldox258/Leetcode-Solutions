int maximumNumberOfWeeksForWhichYo(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumNumberOfWeeksForWhichYo(root->left);
    int r = maximumNumberOfWeeksForWhichYo(root->right);
    return 1 + (l > r ? l : r);
}