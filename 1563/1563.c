int stoneGameV(struct TreeNode* root) {
    if (!root) return 0;
    int l = stoneGameV(root->left);
    int r = stoneGameV(root->right);
    return 1 + (l > r ? l : r);
}