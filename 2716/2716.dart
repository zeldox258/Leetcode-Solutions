class Solution {
  int minimizedStringLength(String s) {
    Set<String> uniqueChars = {};
    for (int i = 0; i < s.length; i++) {
      uniqueChars.add(s[i]);
    }
    return uniqueChars.length;
  }
}