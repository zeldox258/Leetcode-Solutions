class Solution {
public:
    int minimumTimeToMakeRopeColorful(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumTimeToMakeRopeColorful(root->left),minimumTimeToMakeRopeColorful(root->right));
    }
};