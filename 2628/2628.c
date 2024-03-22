int jsonDeepEqual(struct TreeNode* root) {
    if (!root) return 0;
    int l = jsonDeepEqual(root->left);
    int r = jsonDeepEqual(root->right);
    return 1 + (l > r ? l : r);
}