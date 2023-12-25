class Solution {
    fun minimizedStringLength(s: String): Int {
        val uniqueChars = HashSet<Char>()
        for (char in s) {
            uniqueChars.add(char)
        }
        return uniqueChars.size
    }
}