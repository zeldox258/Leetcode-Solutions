func maximizeAlternatingSumUsingSwa(s string) bool {
	st := []rune{}
	pairs := map[rune]rune{'(': ')', '[': ']', '{': '}'}
	for _, c := range s {
		if _, ok := pairs[c]; ok {
			st = append(st, c)
		} else {
			if len(st) == 0 || pairs[st[len(st)-1]] != c {
				return false
			}
			st = st[:len(st)-1]
		}
	}
	return len(st) == 0
}