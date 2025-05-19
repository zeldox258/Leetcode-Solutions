class Solution {
public:
    int lengthOfTheLongestIncreasingPa(TreeNode* root) {
        if(!root) return 0;
        return 1+max(lengthOfTheLongestIncreasingPa(root->left),lengthOfTheLongestIncreasingPa(root->right));
    }
};