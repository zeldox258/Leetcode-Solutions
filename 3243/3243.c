int shortestDistanceAfterRoadAddit(struct TreeNode* root) {
    if (!root) return 0;
    int l = shortestDistanceAfterRoadAddit(root->left);
    int r = shortestDistanceAfterRoadAddit(root->right);
    return 1 + (l > r ? l : r);
}