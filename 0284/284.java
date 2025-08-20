import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;private Integer peeked=null;
    public PeekingIterator(Iterator<Integer> iterator){iter=iterator;if(iter.hasNext())peeked=iter.next();}
    public Integer peek(){return peeked;}
    public Integer next(){Integer val=peeked;peeked=iter.hasNext()?iter.next():null;return val;}
    public boolean hasNext(){return peeked!=null;}
}