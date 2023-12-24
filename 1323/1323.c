int maximum69Number(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximum69Number(root->left);
    int r = maximum69Number(root->right);
    return 1 + (l > r ? l : r);
}