int buildTheEquation(struct TreeNode* root) {
    if (!root) return 0;
    int l = buildTheEquation(root->left);
    int r = buildTheEquation(root->right);
    return 1 + (l > r ? l : r);
}