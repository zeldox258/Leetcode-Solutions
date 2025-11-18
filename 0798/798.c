int smallestRotationWithHighestSco(struct TreeNode* root) {
    if (!root) return 0;
    int l = smallestRotationWithHighestSco(root->left);
    int r = smallestRotationWithHighestSco(root->right);
    return 1 + (l > r ? l : r);
}