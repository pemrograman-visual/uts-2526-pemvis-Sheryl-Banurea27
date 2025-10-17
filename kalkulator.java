import java.util.*;
import java.lang.Math;

public class kalkulator {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int penjumlahan, perkalian, pengurangan, pembagian, hasil, a, b;
        int pilihan;

        pilihan = Integer.parseInt(input.nextLine());
        if (pilihan == 1) {
            a = Integer.parseInt(input.nextLine());
            b = Integer.parseInt(input.nextLine());
            hasil = a + b;
            System.out.println(hasil);
        } else {
            if (pilihan == 2) {
                a = Integer.parseInt(input.nextLine());
                b = Integer.parseInt(input.nextLine());
                hasil = a - b;
                System.out.println(hasil);
            } else {
                if (pilihan == 3) {
                    a = Integer.parseInt(input.nextLine());
                    b = Integer.parseInt(input.nextLine());
                    hasil = a * b;
                    System.out.println(hasil);
                } else {
                    if (pilihan == 4) {
                        a = Integer.parseInt(input.nextLine());
                        b = Integer.parseInt(input.nextLine());
                        hasil = (double) a / b;
                        System.out.println(hasil);
                    } else {
                        a = Integer.parseInt(input.nextLine());
                        b = Integer.parseInt(input.nextLine());
                        hasil = (double) a / b;
                        System.out.println(hasil);
                    }
                }
            }
        }
    }
}
