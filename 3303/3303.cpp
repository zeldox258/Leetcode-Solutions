class Solution {
public:
    int findTheOccurrenceOfFirstAlmost(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheOccurrenceOfFirstAlmost(root->left),findTheOccurrenceOfFirstAlmost(root->right));
    }
};