class Solution {
public:
    int mirrorDistanceOfAnInteger(TreeNode* root) {
        if(!root) return 0;
        return 1+max(mirrorDistanceOfAnInteger(root->left),mirrorDistanceOfAnInteger(root->right));
    }
};