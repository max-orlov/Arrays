package program;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramDeep {
    public static void main(String[] args) {
        int[][] mass = new int[3][4];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = x.nextInt();
            }
        }
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            int a = mass[i][0];
            int b = mass[i][1];
        }
    }


}
