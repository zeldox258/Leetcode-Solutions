int findSpecialSubstringOfLengthK(char* s) {
    int freq[128] = {0};
    int l = 0, res = 0, len = strlen(s);
    for (int r = 0; r < len; r++) {
        while (freq[(int)s[r]]) freq[(int)s[l++]]--;
        freq[(int)s[r]]++;
        if (r - l + 1 > res) res = r - l + 1;
    }
    return res;
}