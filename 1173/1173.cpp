class Solution {
public:
    int immediateFoodDeliveryI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(immediateFoodDeliveryI(root->left),immediateFoodDeliveryI(root->right));
    }
};