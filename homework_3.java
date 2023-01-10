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
public class homework_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satır ve stun sayısını giriniz");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A nın eleamnlarını giriniz");
                a[i][j] = input.nextInt();
            }

        }
        int enb = a[0][0], enk = a[0][0];
        int satırb = 0, sutunb = 0, satırk = 0, sutunk = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (enb < a[i][j]) {
                    enb = a[i][j];
                    satırb = i;
                    sutunb = j;
                }
                if (enk > a[i][j]) {
                    enk = a[i][j];
                    satırk = i;
                    sutunk = j;
                }
            }
        }
        System.out.println("En büyük eleman :" + enb + "Satırı :" + satırb + "Sutunu :" + sutunb);
        System.out.println("En küçük eleman :" + enk + "Satırı :" + satırk + "Sutunu :" + sutunk);
    }
}
