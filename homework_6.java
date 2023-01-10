/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_13;

import java.util.Scanner;

/**
 *
 * @author Enes
 */
public class homework_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen matrisin kaç satır ve stundan oluşacağını giriniz");
        int n = input.nextInt();
        int[][] matris = new int[n][n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Matrisin " + (i + 1) + " satır " + (j + 1) + " stununu giriniz");
                matris[i][j] = input.nextInt();
                if (i + j < 5) {
                    sum += matris[i][j];
                }

            }
        }
        System.out.println("Toplam :" + sum);

    }
}