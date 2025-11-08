class Solution {
public:
    int camelcaseMatching(TreeNode* root) {
        if(!root) return 0;
        return 1+max(camelcaseMatching(root->left),camelcaseMatching(root->right));
    }
};