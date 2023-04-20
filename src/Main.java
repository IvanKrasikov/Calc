import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        String str = in.nextLine();
        char n = ' ';
        String a = "";
        String b = "";
        int sum = 0;
        boolean f = false;
        boolean p = false;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s >= '0' && s <= '9') {
                if (!p) a = a + s;
                else b = b + s;
            } else if ( s == '+' || s == '-' || s == '*' || s == '/') {
                if (n == ' ') {
                    n = s;
                    p = true;
                } else f = true;
            } else if ( s == ' ') {

            } else f = true;
        }
        if ( f || a == "" || b == "" || n == ' ') {
            System.out.println("throws Exception");
        } else {
            int x1 = Integer.parseInt(a);
            int x2 = Integer.parseInt(b);
            if (x1 > 10 || x1 < 0) f = true;
            if (x2 > 10 || x2 < 0) f = true;
            if ( f ) {
                System.out.println("throws Exception");
            } else {
                switch ( n ) {
                    case '+' -> sum = x1 + x2;
                    case '-' -> sum = x1 - x2;
                    case '*' -> sum = x1 * x2;
                    case '/' -> sum = x1 / x2;
                    default -> {
                    }
                }
                System.out.println("Output:");
                System.out.println(sum);
            }
        }
        in.close();
    }
}