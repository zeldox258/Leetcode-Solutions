int mirrorReflection(struct TreeNode* root) {
    if (!root) return 0;
    int l = mirrorReflection(root->left);
    int r = mirrorReflection(root->right);
    return 1 + (l > r ? l : r);
}