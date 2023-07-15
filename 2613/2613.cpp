class Solution {
public:
    int beautifulPairs(TreeNode* root) {
        if(!root) return 0;
        return 1+max(beautifulPairs(root->left),beautifulPairs(root->right));
    }
};