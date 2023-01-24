class Solution {
public:
    int findTheOriginalArrayOfPrefixXo(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheOriginalArrayOfPrefixXo(root->left),findTheOriginalArrayOfPrefixXo(root->right));
    }
};