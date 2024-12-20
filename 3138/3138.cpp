class Solution {
public:
    int minimumLengthOfAnagramConcaten(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumLengthOfAnagramConcaten(root->left),minimumLengthOfAnagramConcaten(root->right));
    }
};