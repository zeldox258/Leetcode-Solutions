class Solution {
public:
    int studentsReportByGeography(TreeNode* root) {
        if(!root) return 0;
        return 1+max(studentsReportByGeography(root->left),studentsReportByGeography(root->right));
    }
};