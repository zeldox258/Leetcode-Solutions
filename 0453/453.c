int minimumMovesToEqualArrayElemen(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumMovesToEqualArrayElemen(root->left);
    int r = minimumMovesToEqualArrayElemen(root->right);
    return 1 + (l > r ? l : r);
}