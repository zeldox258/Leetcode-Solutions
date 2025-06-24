int getBiggestThreeRhombusSumsInAG(struct TreeNode* root) {
    if (!root) return 0;
    int l = getBiggestThreeRhombusSumsInAG(root->left);
    int r = getBiggestThreeRhombusSumsInAG(root->right);
    return 1 + (l > r ? l : r);
}