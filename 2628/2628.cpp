class Solution {
public:
    int jsonDeepEqual(TreeNode* root) {
        if(!root) return 0;
        return 1+max(jsonDeepEqual(root->left),jsonDeepEqual(root->right));
    }
};