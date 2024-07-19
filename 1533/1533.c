int findTheIndexOfTheLargeInteger(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheIndexOfTheLargeInteger(root->left);
    int r = findTheIndexOfTheLargeInteger(root->right);
    return 1 + (l > r ? l : r);
}