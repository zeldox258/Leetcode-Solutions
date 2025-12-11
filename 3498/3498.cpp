class Solution {
public:
    int reverseDegreeOfAString(TreeNode* root) {
        if(!root) return 0;
        return 1+max(reverseDegreeOfAString(root->left),reverseDegreeOfAString(root->right));
    }
};