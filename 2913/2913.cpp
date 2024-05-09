class Solution {
public:
    int subarraysDistinctElementSumOfS(TreeNode* root) {
        if(!root) return 0;
        return 1+max(subarraysDistinctElementSumOfS(root->left),subarraysDistinctElementSumOfS(root->right));
    }
};