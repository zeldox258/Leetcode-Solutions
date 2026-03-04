int validPermutationsForDiSequence(struct TreeNode* root) {
    if (!root) return 0;
    int l = validPermutationsForDiSequence(root->left);
    int r = validPermutationsForDiSequence(root->right);
    return 1 + (l > r ? l : r);
}