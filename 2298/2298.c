int tasksCountInTheWeekend(struct TreeNode* root) {
    if (!root) return 0;
    int l = tasksCountInTheWeekend(root->left);
    int r = tasksCountInTheWeekend(root->right);
    return 1 + (l > r ? l : r);
}