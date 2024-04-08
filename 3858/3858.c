int minimumBitwiseOrFromGrid(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumBitwiseOrFromGrid(root->left);
    int r = minimumBitwiseOrFromGrid(root->right);
    return 1 + (l > r ? l : r);
}