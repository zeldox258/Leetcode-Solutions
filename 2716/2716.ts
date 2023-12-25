function minimizedStringLength(s: string): number {
    const set: Set<string> = new Set();
    for (let i = 0; i < s.length; i++) {
        set.add(s.charAt(i));
    }
    return set.size;
};