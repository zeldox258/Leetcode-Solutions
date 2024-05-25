
class MyCircularQueue {
    int[] data; int head, tail, size, cap;
    public MyCircularQueue(int k) { data = new int[k]; cap = k; }
    public boolean enQueue(int value) {
        if (isFull()) return false;
        data[tail]=value; tail=(tail+1)%cap; size++; return true;
    }
    public boolean deQueue() {
        if (isEmpty()) return false; head=(head+1)%cap; size--; return true;
    }
    public int Front() { return isEmpty() ? -1 : data[head]; }
    public int Rear() { return isEmpty() ? -1 : data[(tail-1+cap)%cap]; }
    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == cap; }
}
