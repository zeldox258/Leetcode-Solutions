int minimumDeletionsToMakeStringBa(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumDeletionsToMakeStringBa(root->left);
    int r = minimumDeletionsToMakeStringBa(root->right);
    return 1 + (l > r ? l : r);
}