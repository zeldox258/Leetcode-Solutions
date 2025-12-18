int countUniqueCharactersOfAllSubs(struct TreeNode* root) {
    if (!root) return 0;
    int l = countUniqueCharactersOfAllSubs(root->left);
    int r = countUniqueCharactersOfAllSubs(root->right);
    return 1 + (l > r ? l : r);
}