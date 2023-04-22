int reverseDegreeOfAString(struct TreeNode* root) {
    if (!root) return 0;
    int l = reverseDegreeOfAString(root->left);
    int r = reverseDegreeOfAString(root->right);
    return 1 + (l > r ? l : r);
}