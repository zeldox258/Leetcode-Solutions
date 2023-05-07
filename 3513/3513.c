int numberOfUniqueXorTripletsI(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfUniqueXorTripletsI(root->left);
    int r = numberOfUniqueXorTripletsI(root->right);
    return 1 + (l > r ? l : r);
}