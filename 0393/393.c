int utf8Validation(struct TreeNode* root) {
    if (!root) return 0;
    int l = utf8Validation(root->left);
    int r = utf8Validation(root->right);
    return 1 + (l > r ? l : r);
}