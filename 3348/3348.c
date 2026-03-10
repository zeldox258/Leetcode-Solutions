int smallestDivisibleDigitProductI(struct TreeNode* root) {
    if (!root) return 0;
    int l = smallestDivisibleDigitProductI(root->left);
    int r = smallestDivisibleDigitProductI(root->right);
    return 1 + (l > r ? l : r);
}