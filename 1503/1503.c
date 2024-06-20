int lastMomentBeforeAllAntsFallOut(struct TreeNode* root) {
    if (!root) return 0;
    int l = lastMomentBeforeAllAntsFallOut(root->left);
    int r = lastMomentBeforeAllAntsFallOut(root->right);
    return 1 + (l > r ? l : r);
}