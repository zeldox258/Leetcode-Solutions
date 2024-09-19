function validPalindrome(s: string): boolean {
    const st: string[] = [];
    const pairs: Record<string, string> = {'(': ')', '[': ']', '{': '}'};
    for (const c of s) {
        if (pairs[c]) st.push(c);
        else {
            if (!st.length || pairs[st.pop()!] !== c) return false;
        }
    }
    return st.length === 0;
}