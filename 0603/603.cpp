class Solution {
public:
    int consecutiveAvailableSeats(TreeNode* root) {
        if(!root) return 0;
        return 1+max(consecutiveAvailableSeats(root->left),consecutiveAvailableSeats(root->right));
    }
};