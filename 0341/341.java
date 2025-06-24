
import java.util.*;
class NestedIterator implements Iterator<Integer> {
    Deque<Iterator<NestedInteger>> stack=new ArrayDeque<>();
    Integer next=null;
    public NestedIterator(List<NestedInteger> nestedList) { stack.push(nestedList.iterator()); }
    public Integer next() { hasNext(); Integer tmp=next; next=null; return tmp; }
    public boolean hasNext() {
        if (next!=null) return true;
        while (!stack.isEmpty()) {
            if (!stack.peek().hasNext()) { stack.pop(); continue; }
            NestedInteger ni=stack.peek().next();
            if (ni.isInteger()) { next=ni.getInteger(); return true; }
            stack.push(ni.getList().iterator());
        }
        return false;
    }
}
