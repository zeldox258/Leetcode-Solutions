int binaryNumberWithAlternatingBit(struct TreeNode* root) {
    if (!root) return 0;
    int l = binaryNumberWithAlternatingBit(root->left);
    int r = binaryNumberWithAlternatingBit(root->right);
    return 1 + (l > r ? l : r);
}