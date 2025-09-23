int arrayWithElementsNotEqualToAve(struct TreeNode* root) {
    if (!root) return 0;
    int l = arrayWithElementsNotEqualToAve(root->left);
    int r = arrayWithElementsNotEqualToAve(root->right);
    return 1 + (l > r ? l : r);
}