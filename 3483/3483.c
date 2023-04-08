int unique3digitEvenNumbers(struct TreeNode* root) {
    if (!root) return 0;
    int l = unique3digitEvenNumbers(root->left);
    int r = unique3digitEvenNumbers(root->right);
    return 1 + (l > r ? l : r);
}