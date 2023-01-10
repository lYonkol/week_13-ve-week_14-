package week_13;

import java.util.Scanner;

public class homework_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kaç tane şirket olduğunu giriniz");
        int n = input.nextInt();
        int[][] company = new int[n][12];
        double[]ort =new double[n];
        int [][] rapor =new int[n][12];
        for (int i = 0; i < company.length; i++) {
            for (int j = 0; j <= 12; j++) {
                System.out.println("Lutfen" + (i + 1) + "şirketin" + (j + 1) + "ay gelirini giriniz");
                company[i][j] = input.nextInt();
            }

        }

        for (int j = 0; j < company.length; j++) {
            double toplam =0;
            for (int k = 0; k <= 12; k++) {
                 toplam += company[j][k];
                 ort[j] = toplam / n;
            }
               
        }
                for (int i = 0; i < company.length; i++) {
            int max = company[i][0], min = company[i][0];
            int maxid = company[i][0], minid = company[i][0];
            for (int j = 0; j <= 12; j++) {
                if (company[i][j] > max) {
                    max = company[i][j];
                }
                if (company[i][j] < min) {
                    min = company[i][j];
                } 
            }
           rapor[i][0] = max;
           rapor[i][1] = maxid;
           rapor[i][3] = min;
           rapor[i][4] = minid;
        }
    }
}
