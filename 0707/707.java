
class MyLinkedList {
    int val; MyLinkedList next;
    MyLinkedList head = null; int size = 0;
    public int get(int index) {
        if (index >= size) return -1;
        MyLinkedList cur = head; for (int i = 0; i < index; i++) cur = cur.next; return cur.val;
    }
    public void addAtHead(int val) { addAtIndex(0, val); }
    public void addAtTail(int val) { addAtIndex(size, val); }
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        MyLinkedList node = new MyLinkedList(); node.val = val;
        if (index == 0) { node.next = head; head = node; }
        else { MyLinkedList cur = head; for (int i = 0; i < index - 1; i++) cur = cur.next; node.next = cur.next; cur.next = node; }
        size++;
    }
    public void deleteAtIndex(int index) {
        if (index >= size) return;
        if (index == 0) { head = head.next; }
        else { MyLinkedList cur = head; for (int i = 0; i < index - 1; i++) cur = cur.next; cur.next = cur.next.next; }
        size--;
    }
}
