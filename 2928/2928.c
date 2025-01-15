int distributeCandiesAmongChildren(struct TreeNode* root) {
    if (!root) return 0;
    int l = distributeCandiesAmongChildren(root->left);
    int r = distributeCandiesAmongChildren(root->right);
    return 1 + (l > r ? l : r);
}