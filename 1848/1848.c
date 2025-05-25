int minimumDistanceToTheTargetElem(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumDistanceToTheTargetElem(root->left);
    int r = minimumDistanceToTheTargetElem(root->right);
    return 1 + (l > r ? l : r);
}