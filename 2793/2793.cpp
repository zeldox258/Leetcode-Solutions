class Solution {
public:
    int statusOfFlightTickets(TreeNode* root) {
        if(!root) return 0;
        return 1+max(statusOfFlightTickets(root->left),statusOfFlightTickets(root->right));
    }
};