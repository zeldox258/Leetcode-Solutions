class Solution {
public:
    int houseRobberIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(houseRobberIi(root->left),houseRobberIi(root->right));
    }
};