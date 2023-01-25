class Solution {
public:
    int minimumSensorsToCoverGrid(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumSensorsToCoverGrid(root->left),minimumSensorsToCoverGrid(root->right));
    }
};