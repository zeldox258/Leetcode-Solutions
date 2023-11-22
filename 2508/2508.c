int addEdgesToMakeDegreesOfAllNode(struct TreeNode* root) {
    if (!root) return 0;
    int l = addEdgesToMakeDegreesOfAllNode(root->left);
    int r = addEdgesToMakeDegreesOfAllNode(root->right);
    return 1 + (l > r ? l : r);
}