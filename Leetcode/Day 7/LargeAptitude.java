import java.util.Scanner;

public class Main {

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int alt = 0;

        for (int i : gain) {
            alt += i;
            max = Math.max(max, alt);
        }

        return max;
    }

    public static void LargeAptitude(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of gain array: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter the gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude = " + result);

        sc.close();
    }
}
