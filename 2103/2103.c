int ringsAndRods(struct TreeNode* root) {
    if (!root) return 0;
    int l = ringsAndRods(root->left);
    int r = ringsAndRods(root->right);
    return 1 + (l > r ? l : r);
}