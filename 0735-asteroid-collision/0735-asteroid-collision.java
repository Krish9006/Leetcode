class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            int current = asteroids[i];
            while (!stack.isEmpty() && current < 0 && stack.peek() > 0) {
                if (stack.peek() < -current) {
                    stack.pop();
                } else if (stack.peek() == -current) {
                    stack.pop();
                    current = 0;
                    break;
                } else {
                    current = 0;
                    break;
                }
            }
            
            if (current != 0) {
                stack.push(current);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
