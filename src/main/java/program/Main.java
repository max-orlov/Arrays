package program;

import arrays.ArraysUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int[] mass = new int[s.nextInt()];
        System.out.println("Введите числа через пробел");
        ArraysUtil.fill(mass, s);
        //ArraysUtil.fillPrimeRandom(mass);
        //System.out.println(ArraysUtil.toString(mass));
        int[] a = ArraysUtil.unique(mass);
        System.out.println(a);
                //System.out.println(ArraysUtil.isPrime(127));

    }
}


