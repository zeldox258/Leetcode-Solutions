int sortThePeople(struct TreeNode* root) {
    if (!root) return 0;
    int l = sortThePeople(root->left);
    int r = sortThePeople(root->right);
    return 1 + (l > r ? l : r);
}