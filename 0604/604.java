
public class StringIterator {
    Deque<long[]> queue = new ArrayDeque<>();
    public StringIterator(String compressedString) {
        int i = 0, n = compressedString.length();
        while (i < n) {
            char c = compressedString.charAt(i++);
            long cnt = 0;
            while (i < n && Character.isDigit(compressedString.charAt(i)))
                cnt = cnt*10 + (compressedString.charAt(i++) - '0');
            queue.offer(new long[]{c, cnt});
        }
    }
    public char next() {
        if (!hasNext()) return ' ';
        long[] top = queue.peek();
        top[1]--;
        if (top[1] == 0) queue.poll();
        return (char)top[0];
    }
    public boolean hasNext() { return !queue.isEmpty(); }
}
