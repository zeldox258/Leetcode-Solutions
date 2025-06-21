int replaceWords(struct TreeNode* root) {
    if (!root) return 0;
    int l = replaceWords(root->left);
    int r = replaceWords(root->right);
    return 1 + (l > r ? l : r);
}