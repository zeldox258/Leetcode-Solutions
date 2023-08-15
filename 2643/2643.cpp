class Solution {
public:
    int rowWithMaximumOnes(TreeNode* root) {
        if(!root) return 0;
        return 1+max(rowWithMaximumOnes(root->left),rowWithMaximumOnes(root->right));
    }
};