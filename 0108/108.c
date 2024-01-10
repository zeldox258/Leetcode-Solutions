int convertSortedArrayToBinarySear(struct TreeNode* root) {
    if (!root) return 0;
    int l = convertSortedArrayToBinarySear(root->left);
    int r = convertSortedArrayToBinarySear(root->right);
    return 1 + (l > r ? l : r);
}