/**
 * @param {string} s
 * @return {boolean}
 */
var findTheMaximumNumberOfElements = function(s) {
    const st = [];
    const pairs = {'(': ')', '[': ']', '{': '}'};
    for (const c of s) {
        if (pairs[c]) st.push(c);
        else {
            if (!st.length || pairs[st.pop()] !== c) return false;
        }
    }
    return st.length === 0;
};