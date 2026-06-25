import java.util.Scanner;

public class CountSub {

    public static int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int totalSubarrays = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    count++;
                }

                int len = j - i + 1;

                if (count > len / 2) {
                    totalSubarrays++;
                }
            }
        }

        return totalSubarrays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = countMajoritySubarrays(nums, target);

        System.out.println(result);
    }
}
