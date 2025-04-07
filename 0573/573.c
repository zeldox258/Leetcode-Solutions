int squirrelSimulation(struct TreeNode* root) {
    if (!root) return 0;
    int l = squirrelSimulation(root->left);
    int r = squirrelSimulation(root->right);
    return 1 + (l > r ? l : r);
}