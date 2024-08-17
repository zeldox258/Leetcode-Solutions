int sumOfSquaresOfSpecialElements(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfSquaresOfSpecialElements(root->left);
    int r = sumOfSquaresOfSpecialElements(root->right);
    return 1 + (l > r ? l : r);
}