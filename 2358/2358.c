int maximumNumberOfGroupsEnteringA(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumNumberOfGroupsEnteringA(root->left);
    int r = maximumNumberOfGroupsEnteringA(root->right);
    return 1 + (l > r ? l : r);
}