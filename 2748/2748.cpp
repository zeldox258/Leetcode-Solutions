class Solution {
public:
    int numberOfBeautifulPairs(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfBeautifulPairs(root->left),numberOfBeautifulPairs(root->right));
    }
};