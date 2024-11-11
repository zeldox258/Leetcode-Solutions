class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            int num = nums[i];
            if (num >= nums[i + 1]) {
                int guess = nums[i + 1] - 1;
                int diff = num - guess;
                while (!isPrime(diff)) {
                    if (guess < i + 1) return false;
                    guess--;
                    diff++;
                }
                if (guess < i + 1) return false;
                nums[i] = guess;
            }
        }

        return true;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        int left = 2;
        int right = num /2 + 1;
        while (left <= right) {
            if (num % left == 0) return false;
            left++;
            right = num / left + 1;
        }
        return true;
    }
}