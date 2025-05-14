class Solution {
public:
    int timeNeededToBuyTickets(TreeNode* root) {
        if(!root) return 0;
        return 1+max(timeNeededToBuyTickets(root->left),timeNeededToBuyTickets(root->right));
    }
};