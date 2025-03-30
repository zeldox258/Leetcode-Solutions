int maximizeTheNumberOfPartitionsA(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximizeTheNumberOfPartitionsA(root->left);
    int r = maximizeTheNumberOfPartitionsA(root->right);
    return 1 + (l > r ? l : r);
}