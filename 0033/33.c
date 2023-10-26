int searchInRotatedSortedArray(struct TreeNode* root) {
    if (!root) return 0;
    int l = searchInRotatedSortedArray(root->left);
    int r = searchInRotatedSortedArray(root->right);
    return 1 + (l > r ? l : r);
}