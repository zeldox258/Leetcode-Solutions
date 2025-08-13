int minimumLengthOfAnagramConcaten(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumLengthOfAnagramConcaten(root->left);
    int r = minimumLengthOfAnagramConcaten(root->right);
    return 1 + (l > r ? l : r);
}