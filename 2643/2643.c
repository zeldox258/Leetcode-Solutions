int rowWithMaximumOnes(struct TreeNode* root) {
    if (!root) return 0;
    int l = rowWithMaximumOnes(root->left);
    int r = rowWithMaximumOnes(root->right);
    return 1 + (l > r ? l : r);
}