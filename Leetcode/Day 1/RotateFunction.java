class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int F = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }
        int max = F;
        for (int k = 1; k < n; k++) {
            F = F + sum - n * nums[n - k];
            max = Math.max(max, F);
        }
        return max;
    }
}
/* EXPLANATION:
This code finds the maximum value of a special function after rotating an array. 
First, it calculates the total sum of all elements and also computes the
initial score of the array without any rotation, where each element is multiplied by its index.
After that, instead of physically rotating the array again and again, it uses a smart idea:
    when the array is rotated once, every element’s index increases by 1, 
    so the score increases by the total sum of the array, but at the same time, one element moves from the end to the front, 
    so we subtract its extra contribution. 
  This change is captured using the formula 
  
  F = F + sum - n * nums[n - k]
  
  By repeatedly applying this update for each rotation, the code efficiently finds
  the maximum possible score without recomputing everything from scratch each time. */
