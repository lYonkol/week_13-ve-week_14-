package week_13;

import java.util.Scanner;

public class homework_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen matrisin satır ve stun sayısını giriniz");
        int n = input.nextInt();
        int[][] matris = new int[n][n];
        boolean kontrol = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Matrisin " + (i + 1) + " satır " + (j + 1) + " stununu giriniz");
                matris[i][j] = input.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matris[i][j] != matris[j][i]) {
                    kontrol = false;
                }
            }

        }
        if (kontrol = true) {
            System.out.println("Matrisiniz simetrik değildir");
        } else {
            System.out.println("Matrisinis simetriktir");
        }

    }
}
