class Solution {
public:
    int mirrorReflection(TreeNode* root) {
        if(!root) return 0;
        return 1+max(mirrorReflection(root->left),mirrorReflection(root->right));
    }
};