class Solution {
public:
    int maximumPerformanceOfATeam(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumPerformanceOfATeam(root->left),maximumPerformanceOfATeam(root->right));
    }
};