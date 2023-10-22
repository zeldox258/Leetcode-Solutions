int numberOfBeautifulPartitions(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfBeautifulPartitions(root->left);
    int r = numberOfBeautifulPartitions(root->right);
    return 1 + (l > r ? l : r);
}