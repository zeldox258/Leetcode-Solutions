int minimumTimeToKillAllMonsters(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumTimeToKillAllMonsters(root->left);
    int r = minimumTimeToKillAllMonsters(root->right);
    return 1 + (l > r ? l : r);
}