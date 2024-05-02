/**
 * @param {TreeNode} root
 * @return {number}
 */
var excelSheetColumnTitle = function(root) {
    if (!root) return 0;
    return 1 + Math.max(excelSheetColumnTitle(root.left), excelSheetColumnTitle(root.right));
};