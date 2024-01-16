
class ExamRoom {
    TreeSet<Integer> seats;
    int n;
    public ExamRoom(int n) { this.n = n; seats = new TreeSet<>(); }
    public int seat() {
        if (seats.isEmpty()) { seats.add(0); return 0; }
        int dist = seats.first(), seat = 0;
        int prev = seats.first();
        for (int s : seats) {
            if (s != prev) { int d = (s - prev) / 2; if (d > dist) { dist = d; seat = prev + d; } }
            prev = s;
        }
        if (n - 1 - seats.last() > dist) seat = n - 1;
        seats.add(seat); return seat;
    }
    public void leave(int p) { seats.remove(p); }
}
