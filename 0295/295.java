import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> lo=new PriorityQueue<>(Collections.reverseOrder()),hi=new PriorityQueue<>();
    public void addNum(int num){lo.offer(num);hi.offer(lo.poll());if(lo.size()<hi.size())lo.offer(hi.poll());}
    public double findMedian(){return lo.size()>hi.size()?lo.peek():(lo.peek()+hi.peek())/2.0;}
}