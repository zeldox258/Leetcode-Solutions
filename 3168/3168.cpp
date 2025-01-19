class Solution {
public:
    int minimumNumberOfChairsInAWaitin(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumNumberOfChairsInAWaitin(root->left),minimumNumberOfChairsInAWaitin(root->right));
    }
};