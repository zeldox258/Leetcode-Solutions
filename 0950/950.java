
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length; java.util.Arrays.sort(deck);
        java.util.Deque<Integer> dq=new java.util.LinkedList<>(); for(int i=0;i<n;i++) dq.offer(i);
        int[]res=new int[n]; for(int v:deck){res[dq.pollFirst()]=v;if(!dq.isEmpty())dq.addLast(dq.pollFirst());}
        return res;
    }
}
