int checkIfEveryRowAndColumnContai(struct TreeNode* root) {
    if (!root) return 0;
    int l = checkIfEveryRowAndColumnContai(root->left);
    int r = checkIfEveryRowAndColumnContai(root->right);
    return 1 + (l > r ? l : r);
}