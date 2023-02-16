class Solution {
public:
    int minimumTotalDistanceTraveled(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumTotalDistanceTraveled(root->left),minimumTotalDistanceTraveled(root->right));
    }
};