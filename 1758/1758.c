int minimumChangesToMakeAlternatin(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumChangesToMakeAlternatin(root->left);
    int r = minimumChangesToMakeAlternatin(root->right);
    return 1 + (l > r ? l : r);
}