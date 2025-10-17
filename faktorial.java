import java.util.*;
import java.lang.Math;

public class faktorial {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, result;

        x = Integer.parseInt(input.nextLine());
        if (0 < x && x <= 15) {
            result = factorial(x);
            System.out.println("factorial(" + x + ")=" + result);
        } else {
            if (x == 0) {
                System.out.println("1");
            } else {
                System.out.println("x harus dari 0 sampai 15");
            }
        }
    }
    
    public static int factorial(int inX) {
        int result;

        if (inX == 1) {
            System.out.println(1);
            result = 1;
        } else {
            System.out.print(Integer.toString(inX) + "x");
            result = inX * factorial(inX - 1);
        }
        
        return result;
    }
}
