class Solution {
public:
    int minimumTimeToCollectAllApplesI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumTimeToCollectAllApplesI(root->left),minimumTimeToCollectAllApplesI(root->right));
    }
};