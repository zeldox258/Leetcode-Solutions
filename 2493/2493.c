int divideNodesIntoTheMaximumNumbe(struct TreeNode* root) {
    if (!root) return 0;
    int l = divideNodesIntoTheMaximumNumbe(root->left);
    int r = divideNodesIntoTheMaximumNumbe(root->right);
    return 1 + (l > r ? l : r);
}