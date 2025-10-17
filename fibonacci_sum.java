import java.util.*;
import java.lang.Math;

public class fibonacci_sum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, i, b, jumlah, n, c;

        i = 1;
        a = 1;
        b = 1;
        jumlah = 0;
        n = Integer.parseInt(input.nextLine());
        for (i = i; i <= n; i++) {
            jumlah = jumlah + a;
            c = a;
            a = b;
            b = c + b;
        }
        System.out.println(jumlah);
    }
}
