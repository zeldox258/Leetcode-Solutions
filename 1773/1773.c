int countItemsMatchingARule(struct TreeNode* root) {
    if (!root) return 0;
    int l = countItemsMatchingARule(root->left);
    int r = countItemsMatchingARule(root->right);
    return 1 + (l > r ? l : r);
}