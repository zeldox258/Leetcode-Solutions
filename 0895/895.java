
class FreqStack {
    Map<Integer, Integer> freq = new HashMap<>();
    Map<Integer, Deque<Integer>> group = new HashMap<>();
    int maxFreq = 0;
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1; freq.put(val, f);
        maxFreq = Math.max(maxFreq, f);
        group.computeIfAbsent(f, k -> new ArrayDeque<>()).push(val);
    }
    public int pop() {
        int val = group.get(maxFreq).pop(); int f = freq.get(val) - 1; freq.put(val, f);
        if (group.get(maxFreq).isEmpty()) maxFreq--;
        return val;
    }
}
