int copyListWithRandomPointer(struct TreeNode* root) {
    if (!root) return 0;
    int l = copyListWithRandomPointer(root->left);
    int r = copyListWithRandomPointer(root->right);
    return 1 + (l > r ? l : r);
}