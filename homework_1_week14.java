/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_14;

/**
 *
 * @author Enes
 */
import java.util.Scanner;
import java.util.Random;
public class homework_1 {

    public static void squere_sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir n sayısı girin");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * i;

        }
        System.out.println("1den " + n + " e olan sayıların kareleri toplamı toplamı : " + sum);
    }

    public static void asal_mi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n = input.nextInt();
        boolean kontrol = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 || n == 1 || n == 0) {
                kontrol = false;
            }

        }

        if (kontrol) {
            System.out.println("Sayınız asaldır");
        } else {
            System.out.println("Sayınız asal değildir");
        }
    }

    public static void array_sort() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dizinin kaç elemanlı olacağını giriniz");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("dizinin " + (i + 1) + ". elemanını giriniz ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = 0;
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[][] rand_matris(int[][]matris,int max){
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                matris[i][j]=r.nextInt();
                System.out.println(matris[i][j]);
            }
        }
        return matris;
    }
    public static int matris_sum(int[][]matris,int[][]matris2,int[]arr){
        int sum =0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                sum += matris[i][j]+matris2[i][j];
            }
            
        }
        return sum;
    }
    public static void star(){
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int row = input.nextInt();
        int satır_sayac =0;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= satır_sayac; j++) {
                System.out.print("*");
            }
            System.out.println("");
            satır_sayac++;
        }
    }
    public static void main(String[] args) {
        star();
   
    }

}
