class Solution {
public:
    int findTheIndexOfTheLargeInteger(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheIndexOfTheLargeInteger(root->left),findTheIndexOfTheLargeInteger(root->right));
    }
};