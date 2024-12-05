class Solution {
    public boolean canChange(String start, String target) {
        char[] str = start.toCharArray();
        char[] tar = target.toCharArray();
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0, j=0; i<str.length; i++, j++) {
            if(tar[i]=='L') {
                if(queue.isEmpty() || queue.peekLast() != -1)
                    queue.offerFirst(1);
                else
                    return false;
            }
            if(str[i] == 'R') {
                if(queue.isEmpty() || queue.peek() != 1)
                    queue.offerLast(-1);
                else
                    return false;
            }
            if(str[i]=='L') {
                if(!queue.isEmpty() && queue.peek() == 1)
                    queue.poll();
                else
                    return false;
            }
            if(tar[i] == 'R') {
                if(!queue.isEmpty() && queue.peekLast() == -1)
                    queue.pollLast();
                else
                    return false;
            }

        }
        return queue.isEmpty();
    }
}