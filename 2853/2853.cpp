class Solution {
public:
    int highestSalariesDifference(TreeNode* root) {
        if(!root) return 0;
        return 1+max(highestSalariesDifference(root->left),highestSalariesDifference(root->right));
    }
};