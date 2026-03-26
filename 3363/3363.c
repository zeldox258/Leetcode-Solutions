int findTheMaximumNumberOfFruitsCo(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheMaximumNumberOfFruitsCo(root->left);
    int r = findTheMaximumNumberOfFruitsCo(root->right);
    return 1 + (l > r ? l : r);
}