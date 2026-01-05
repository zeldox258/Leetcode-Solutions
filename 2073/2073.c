int timeNeededToBuyTickets(struct TreeNode* root) {
    if (!root) return 0;
    int l = timeNeededToBuyTickets(root->left);
    int r = timeNeededToBuyTickets(root->right);
    return 1 + (l > r ? l : r);
}