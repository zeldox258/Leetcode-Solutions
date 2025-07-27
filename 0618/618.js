/**
 * @param {TreeNode} root
 * @return {number}
 */
var studentsReportByGeography = function(root) {
    if (!root) return 0;
    return 1 + Math.max(studentsReportByGeography(root.left), studentsReportByGeography(root.right));
};