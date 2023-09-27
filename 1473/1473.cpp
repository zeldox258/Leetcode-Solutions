class Solution {
public:
    int paintHouseIii(TreeNode* root) {
        if(!root) return 0;
        return 1+max(paintHouseIii(root->left),paintHouseIii(root->right));
    }
};