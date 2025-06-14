class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int startValue = 1;

        while (true) {
            int sum = startValue;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                sum += nums[i];
                if (sum < 1) {
                    valid = false;
                    break;
                }
            }

            if (valid) return startValue;
            startValue++;  
        }
        
    }
}