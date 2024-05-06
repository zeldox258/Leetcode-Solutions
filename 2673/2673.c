int makeCostsOfPathsEqualInABinary(struct TreeNode* root) {
    if (!root) return 0;
    int l = makeCostsOfPathsEqualInABinary(root->left);
    int r = makeCostsOfPathsEqualInABinary(root->right);
    return 1 + (l > r ? l : r);
}