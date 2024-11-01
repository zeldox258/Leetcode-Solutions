int highestSalariesDifference(struct TreeNode* root) {
    if (!root) return 0;
    int l = highestSalariesDifference(root->left);
    int r = highestSalariesDifference(root->right);
    return 1 + (l > r ? l : r);
}