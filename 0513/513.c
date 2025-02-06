int findBottomLeftTreeValue(struct TreeNode* root) {
    if (!root) return 0;
    int l = findBottomLeftTreeValue(root->left);
    int r = findBottomLeftTreeValue(root->right);
    return 1 + (l > r ? l : r);
}