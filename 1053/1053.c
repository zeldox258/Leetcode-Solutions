int previousPermutationWithOneSwap(struct TreeNode* root) {
    if (!root) return 0;
    int l = previousPermutationWithOneSwap(root->left);
    int r = previousPermutationWithOneSwap(root->right);
    return 1 + (l > r ? l : r);
}