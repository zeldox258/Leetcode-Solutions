int findEdgesInShortestPaths(struct TreeNode* root) {
    if (!root) return 0;
    int l = findEdgesInShortestPaths(root->left);
    int r = findEdgesInShortestPaths(root->right);
    return 1 + (l > r ? l : r);
}