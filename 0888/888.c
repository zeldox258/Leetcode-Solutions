int fairCandySwap(struct TreeNode* root) {
    if (!root) return 0;
    int l = fairCandySwap(root->left);
    int r = fairCandySwap(root->right);
    return 1 + (l > r ? l : r);
}