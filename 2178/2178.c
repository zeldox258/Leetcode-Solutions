int maximumSplitOfPositiveEvenInte(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumSplitOfPositiveEvenInte(root->left);
    int r = maximumSplitOfPositiveEvenInte(root->right);
    return 1 + (l > r ? l : r);
}