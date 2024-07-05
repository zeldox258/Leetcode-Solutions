int waterBottles(struct TreeNode* root) {
    if (!root) return 0;
    int l = waterBottles(root->left);
    int r = waterBottles(root->right);
    return 1 + (l > r ? l : r);
}