
class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop(); int next = stack.peek(); stack.push(top); stack.push(top + next);
            } else if (op.equals("D")) stack.push(stack.peek() * 2);
            else if (op.equals("C")) stack.pop();
            else stack.push(Integer.parseInt(op));
        }
        int sum = 0; for (int n : stack) sum += n; return sum;
    }
}
