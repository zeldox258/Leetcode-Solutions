int smallestMissingNonnegativeInte(struct TreeNode* root) {
    if (!root) return 0;
    int l = smallestMissingNonnegativeInte(root->left);
    int r = smallestMissingNonnegativeInte(root->right);
    return 1 + (l > r ? l : r);
}