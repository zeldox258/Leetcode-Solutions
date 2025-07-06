function convertBinarySearchTreeToSorte(s: string): number {
    const set = new Set<string>();
    let l = 0, res = 0;
    for (let r = 0; r < s.length; r++) {
        while (set.has(s[r])) set.delete(s[l++]);
        set.add(s[r]);
        res = Math.max(res, r - l + 1);
    }
    return res;
}