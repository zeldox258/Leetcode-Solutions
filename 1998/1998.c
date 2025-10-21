int gcdSortOfAnArray(struct TreeNode* root) {
    if (!root) return 0;
    int l = gcdSortOfAnArray(root->left);
    int r = gcdSortOfAnArray(root->right);
    return 1 + (l > r ? l : r);
}