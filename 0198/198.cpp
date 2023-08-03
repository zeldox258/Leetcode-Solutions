class Solution {
public:
    int houseRobber(TreeNode* root) {
        if(!root) return 0;
        return 1+max(houseRobber(root->left),houseRobber(root->right));
    }
};