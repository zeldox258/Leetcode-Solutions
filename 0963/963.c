int minimumAreaRectangleIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumAreaRectangleIi(root->left);
    int r = minimumAreaRectangleIi(root->right);
    return 1 + (l > r ? l : r);
}