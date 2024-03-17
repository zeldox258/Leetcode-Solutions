
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
                if (stack.peek() < -a) { stack.pop(); }
                else if (stack.peek() == -a) { stack.pop(); alive = false; }
                else alive = false;
            }
            if (alive) stack.push(a);
        }
        int[] res = new int[stack.size()]; int i = stack.size() - 1;
        for (int v : stack) res[i--] = v;
        return res;
    }
}
