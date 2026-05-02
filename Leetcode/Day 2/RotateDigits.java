import java.util.*;

class RotateDigits {

    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) count++;
        }
        return count;
    }

    private boolean isGood(int num) {
        boolean changed = false;
        while (num > 0) {
            int d = num % 10;

            if (d == 3 || d == 4 || d == 7) return false; 

            if (d == 2 || d == 5 || d == 6 || d == 9) 
                changed = true; 

            num /= 10;
        }
        return changed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        RotateDigits sol = new RotateDigits();
        int result = sol.rotatedDigits(n);

        System.out.println("Count of good numbers: " + result);

        sc.close();
    }
}
