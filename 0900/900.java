
class RLEIterator {
    int[] encoding; int idx = 0;
    public RLEIterator(int[] encoding) { this.encoding = encoding; }
    public int next(int n) {
        while (idx < encoding.length) {
            if (n <= encoding[idx]) { encoding[idx] -= n; return encoding[idx + 1]; }
            n -= encoding[idx]; idx += 2;
        }
        return -1;
    }
}
