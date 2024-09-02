int statusOfFlightTickets(struct TreeNode* root) {
    if (!root) return 0;
    int l = statusOfFlightTickets(root->left);
    int r = statusOfFlightTickets(root->right);
    return 1 + (l > r ? l : r);
}