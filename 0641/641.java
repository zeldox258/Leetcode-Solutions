
class MyCircularDeque {
    int[] data; int head, tail, size, cap;
    public MyCircularDeque(int k) { data = new int[k]; cap = k; }
    public boolean insertFront(int value) {
        if (isFull()) return false; head=(head-1+cap)%cap; data[head]=value; size++; return true;
    }
    public boolean insertLast(int value) {
        if (isFull()) return false; data[tail]=value; tail=(tail+1)%cap; size++; return true;
    }
    public boolean deleteFront() { if(isEmpty())return false; head=(head+1)%cap;size--;return true; }
    public boolean deleteLast() { if(isEmpty())return false; tail=(tail-1+cap)%cap;size--;return true; }
    public int getFront() { return isEmpty()?-1:data[head]; }
    public int getRear() { return isEmpty()?-1:data[(tail-1+cap)%cap]; }
    public boolean isEmpty() { return size==0; }
    public boolean isFull() { return size==cap; }
}
