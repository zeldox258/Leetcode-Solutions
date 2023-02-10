int maximumDifferenceBetweenAdjace(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumDifferenceBetweenAdjace(root->left);
    int r = maximumDifferenceBetweenAdjace(root->right);
    return 1 + (l > r ? l : r);
}