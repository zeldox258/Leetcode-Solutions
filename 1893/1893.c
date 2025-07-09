int checkIfAllTheIntegersInARangeA(struct TreeNode* root) {
    if (!root) return 0;
    int l = checkIfAllTheIntegersInARangeA(root->left);
    int r = checkIfAllTheIntegersInARangeA(root->right);
    return 1 + (l > r ? l : r);
}