int binarySearchTreeToGreaterSumTr(struct TreeNode* root) {
    if (!root) return 0;
    int l = binarySearchTreeToGreaterSumTr(root->left);
    int r = binarySearchTreeToGreaterSumTr(root->right);
    return 1 + (l > r ? l : r);
}