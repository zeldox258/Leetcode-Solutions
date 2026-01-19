int countFertilePyramidsInALand(struct TreeNode* root) {
    if (!root) return 0;
    int l = countFertilePyramidsInALand(root->left);
    int r = countFertilePyramidsInALand(root->right);
    return 1 + (l > r ? l : r);
}