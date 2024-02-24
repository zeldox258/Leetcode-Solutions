int findMinimumInRotatedSortedArra(struct TreeNode* root) {
    if (!root) return 0;
    int l = findMinimumInRotatedSortedArra(root->left);
    int r = findMinimumInRotatedSortedArra(root->right);
    return 1 + (l > r ? l : r);
}