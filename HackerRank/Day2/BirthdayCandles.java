import java.util.*;

public class BirthdayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallCount = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                tallCount = 1;
            } else if (candles.get(i) == max) {
                tallCount++;
            }
        }

        return tallCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }

        int result = birthdayCakeCandles(candles);
        System.out.println(result);

    }
}
