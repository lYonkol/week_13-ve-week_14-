/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_13;

/**
 *
 * @author Enes
 */
import java .util.Scanner;
public class homework_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen matrisin satır ve sutun sayısını giriniz ");
        int n = input.nextInt();
        int[][] matris = new int[n][n];
        int rowsum=0;
        int colsum=0;
        int rowcolsum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Matrisin " + (i + 1) + " satır " + (j + 1) + " stununu giriniz");
                matris[i][j] = input.nextInt();
                rowsum += matris[i][n-1];
                colsum += matris[n-1][j];
                rowcolsum=matris[n-1][n-1];
                }
            }
        System.out.println("Toplam :"+(rowsum+colsum-rowcolsum));
        }
    
    }
    

