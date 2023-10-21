
class RecentCounter {
    private java.util.Queue<Integer> q;
    public RecentCounter() { q = new java.util.LinkedList<>(); }
    public int ping(int t) { q.offer(t); while (q.peek() < t-3000) q.poll(); return q.size(); }
}
