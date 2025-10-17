import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        double nr, total, maks, min;
        double[] ns = new double[4];

        total = 0;
        for (i = 0; i <= 3; i++) {
            ns[i] = Double.parseDouble(input.nextLine());
            total = total + ns[i];
        }
        nr = total / 4;
        maks = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] > maks) {
                maks = ns[i];
            }
        }
        min = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println(nr);
        System.out.println(maks);
        System.out.println(min);
    }
}
