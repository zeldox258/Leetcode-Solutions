func minimizedStringLength(s string) int {
    uniqueChars := make(map[rune]bool)
	for _, char := range s {
		uniqueChars[char] = true
	}
	return len(uniqueChars)
}