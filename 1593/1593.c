int splitAStringIntoTheMaxNumberOf(struct TreeNode* root) {
    if (!root) return 0;
    int l = splitAStringIntoTheMaxNumberOf(root->left);
    int r = splitAStringIntoTheMaxNumberOf(root->right);
    return 1 + (l > r ? l : r);
}