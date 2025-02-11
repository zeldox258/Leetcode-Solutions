int restoreTheArrayFromAdjacentPai(struct TreeNode* root) {
    if (!root) return 0;
    int l = restoreTheArrayFromAdjacentPai(root->left);
    int r = restoreTheArrayFromAdjacentPai(root->right);
    return 1 + (l > r ? l : r);
}