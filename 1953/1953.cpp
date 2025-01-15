class Solution {
public:
    int maximumNumberOfWeeksForWhichYo(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumNumberOfWeeksForWhichYo(root->left),maximumNumberOfWeeksForWhichYo(root->right));
    }
};