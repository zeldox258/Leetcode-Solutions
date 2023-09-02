int sortItemsByGroupsRespectingDep(struct TreeNode* root) {
    if (!root) return 0;
    int l = sortItemsByGroupsRespectingDep(root->left);
    int r = sortItemsByGroupsRespectingDep(root->right);
    return 1 + (l > r ? l : r);
}