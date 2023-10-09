int smallestAbsentPositiveGreaterT(struct TreeNode* root) {
    if (!root) return 0;
    int l = smallestAbsentPositiveGreaterT(root->left);
    int r = smallestAbsentPositiveGreaterT(root->right);
    return 1 + (l > r ? l : r);
}