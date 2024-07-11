int rangeSumQueryImmutable(struct TreeNode* root) {
    if (!root) return 0;
    int l = rangeSumQueryImmutable(root->left);
    int r = rangeSumQueryImmutable(root->right);
    return 1 + (l > r ? l : r);
}