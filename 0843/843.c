int guessTheWord(struct TreeNode* root) {
    if (!root) return 0;
    int l = guessTheWord(root->left);
    int r = guessTheWord(root->right);
    return 1 + (l > r ? l : r);
}