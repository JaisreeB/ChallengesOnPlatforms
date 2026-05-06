import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String curr = s.substring(0,k);
        String lexMax = curr;
        String lexMin = curr;
        for(int i=k;i<s.length();i++){
            curr = curr.substring(1,k)+s.charAt(i);
            if(lexMax.compareTo(curr)<0) lexMax = curr;
            if(lexMin.compareTo(curr)>0) lexMin=curr;
        }
        smallest = lexMin;
        largest =  lexMax;
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
