int specialArrayWithXElementsGreat(struct TreeNode* root) {
    if (!root) return 0;
    int l = specialArrayWithXElementsGreat(root->left);
    int r = specialArrayWithXElementsGreat(root->right);
    return 1 + (l > r ? l : r);
}