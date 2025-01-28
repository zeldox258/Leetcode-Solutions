int catAndMouseIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = catAndMouseIi(root->left);
    int r = catAndMouseIi(root->right);
    return 1 + (l > r ? l : r);
}