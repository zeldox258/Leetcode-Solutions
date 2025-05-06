func matchSubstringAfterReplacement(s string) int {
	seen := map[byte]bool{}
	l, res := 0, 0
	for r := 0; r < len(s); r++ {
		for seen[s[r]] {
			delete(seen, s[l])
			l++
		}
		seen[s[r]] = true
		if r-l+1 > res {
			res = r - l + 1
		}
	}
	return res
}