
import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] cnt = new int[26]; boolean[] inStack = new boolean[26];
        for (char c : s.toCharArray()) cnt[c-'a']++;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            cnt[c-'a']--;
            if (inStack[c-'a']) continue;
            while (!stack.isEmpty() && stack.peek() > c && cnt[stack.peek()-'a'] > 0) {
                inStack[stack.pop()-'a'] = false;
            }
            stack.push(c); inStack[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.reverse().toString();
    }
}
