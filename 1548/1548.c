int theMostSimilarPathInAGraph(struct TreeNode* root) {
    if (!root) return 0;
    int l = theMostSimilarPathInAGraph(root->left);
    int r = theMostSimilarPathInAGraph(root->right);
    return 1 + (l > r ? l : r);
}