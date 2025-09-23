class Solution {
public:
    int longestTurbulentSubarray(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestTurbulentSubarray(root->left),longestTurbulentSubarray(root->right));
    }
};