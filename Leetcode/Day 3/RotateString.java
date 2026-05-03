public class RotateString {
    public static void main(String[] args) {        
        String s = sc.nextLine();
        String goal = sc.nextLine(); 
        if (s.length() != goal.length()) System.out.print("false"); return;
        if((s + s).contains(goal)) System.out.print("true");
        else System.out.print("false");
    }
}
