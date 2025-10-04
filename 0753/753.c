int crackingTheSafe(struct TreeNode* root) {
    if (!root) return 0;
    int l = crackingTheSafe(root->left);
    int r = crackingTheSafe(root->right);
    return 1 + (l > r ? l : r);
}