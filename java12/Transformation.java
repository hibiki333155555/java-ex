
import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < Integer.parseInt(sc.nextLine()); i++) {
            String[] operation = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(operation[1]);
            int num2 = Integer.parseInt(operation[2]) + 1;
            if (operation[0].equals("print")) {
                System.out.println(str.substring(num1, num2));
            } else if (operation[0].equals("reverse")) {
                StringBuilder builder = new StringBuilder(str.substring(num1, num2)).reverse();
                str.replace(num1, num2, builder.toString());
            } else {
                str.replace(num1, num2, operation[3]);
            }

        }
    }
}
