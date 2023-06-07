
public class Ring {
    public static void main(String[] args) {
        String s = args[0] + args[0];
        String t = args[1];

        if(s.contains(t)) System.out.println("Yes");
        else System.out.println("No");
    }
}
