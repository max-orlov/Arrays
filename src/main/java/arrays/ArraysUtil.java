package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysUtil {


    public static void fill(int[] mass, Scanner t) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = t.nextInt();
        }
    }

    public static int getRandom(int a, int b) {
        int x = (int) (a + Math.random() * (b - a));
        return x;
    }


    public static void fillRandom(int[] mass, int a, int b) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = getRandom(a, b);
        }
    }

    public static String toString(int[] mass) {
        String str = "[";
        for (int i = 0; i < mass.length; i++) {
            str += mass[i];
            if (i != mass.length - 1)
                str += ", ";
        }
        return str + "]";
    }

    public static String evenIndexes(int[] mass) {
        String str = "[";
        for (int i = 0; i < mass.length; i += 2) {
            str += mass[i];
            if (i != mass.length - 2)
                str += ", ";
        }
        return str + "]";
    }

    public static ArrayList<Integer> evenIndexes2(int[] mass) {
        ArrayList<Integer> arList = new ArrayList<Integer>();
        for (int i = 0; i < mass.length; i += 2)
            arList.add(mass[i]);
        return arList;
    }

    public static boolean isEven(int[] mass, int i) {
        return mass[i] % 2 == 0;
    }

    public static String evenData(int[] mass) {
        String str = "[";
        for (int i = 0; i < mass.length; i++) {
            if (isEven(mass, i)) {
                if (!str.equals("["))
                    str += ", ";
                str += mass[i];
            }
        }
        return str + "]";
    }

    public static ArrayList<Integer> evenData2(int[] mass) {
        ArrayList<Integer> arList = new ArrayList<Integer>();
        for (int i = 0; i < mass.length; i++)
            if (isEven(mass, i))
                arList.add(mass[i]);
        return arList;
    }

    public static int countPositive(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0)
                count++;
        }
        return count;
    }

    public static String greatPrev(int[] mass) {
        String str = "[";
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                if (!str.equals("["))
                    str += ", ";
                str += mass[i];
            }
        }
        return str + "]";
    }

    public static ArrayList greatPrev2(int[] mass) {
        ArrayList<Integer> arList = new ArrayList<Integer>();
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1])
                arList.add(mass[i]);
        }
        return arList;
    }

    public static int max(int[] mass) {
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i])
                max = mass[i];
        }
        return max;
    }

    public static ArrayList<Integer> maxValues(int[] mass) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        int maximum = max(mass);
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == maximum)
                index.add(i);
        }
        return index;
    }

    public static int[] maxValues2(int[] mass) {
        int count = 0;
        int maximum = max(mass);
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == maximum)
                count++;
        }
        int[] mass2 = new int[count];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (mass[i] == maximum){
                mass2[j++] = i;
            }
        }
        return mass2;
    }

    public static int minPositive(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min && mass[i] > 0)
                min = mass[i];
        }
        return min;
    }

    public static int minOdd(int[] mass) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (!isEven(mass, i) && mass[i] < min) {
                min = mass[i];
                count++;
            }
        }
        if (count != 0)
            return min;
        else
            return 0;
    }

    public static Integer minOdd2(int[] mass) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (!isEven(mass, i) && mass[i] < min) {
                min = mass[i];
                count++;
            }
        }
        if (count != 0)
            return min;
        else
            return null;
    }

    //----------------------------------------------------------------------------

    public static int greaterNeighbours(int[] mass) {
        int count = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i] > mass[i - 1] && mass[i] > mass[i + 1])
                count++;
        }
        return count;
    }


    public static int countDifferent(int[] mass) {
        int count = 1;
        Arrays.sort(mass);
        for (int i = 1; i < mass.length ; i++) {
            if (mass[i] > mass[i-1])
                count++;
        }
        return count;
    }

    public static void reverse(int[] mass) {
        for (int i = 0; i < mass.length / 2; i++) {
            int x = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = x;
        }
    }

    public static int[] reverseNeighbours(int[] mass) {
        int[] mass2 = new int[mass.length];
        for (int i = 0; i < mass.length - 1; i += 2) {
            mass2[i] = mass[i + 1];
            mass2[i + 1] = mass[i];
        }
        if (mass.length % 2 != 0)
            mass2[mass.length - 1] = mass[mass.length - 1];
        return mass2;
    }



    public static int[] delete(int[] mass, int k) {
        int[] mass2 = new int[mass.length -1];
        for (int i = 0; i < mass.length; i++) {
            if (i < k)
                mass2[i] = mass[i];
            if (i == k)
                continue;
            if (i > k)
                mass2[i-1] = mass[i];
        }
        return mass2;
    }

    public static Integer[] delete2(int[] mass, int k) {
        ArrayList<Integer> arlist = new ArrayList<Integer>();
        for (int i = 0; i < mass.length; i++) {
            arlist.add(mass[i]);
        }
        arlist.remove(k);
        return arlist.toArray(new Integer[arlist.size()]);
    }

    public static int[] insert(int[] mass, int k, int c) {
        int mass2[] = new int[mass.length +1];
        for (int i = 0; i < mass.length ; i++) {
            if (i < k)
                mass2[i] = mass[i];
            if (i == k)
                mass2[i] = c;
            if (i > k)
                mass2[i] = mass[i-1];
        }
        mass2[mass.length] = mass[mass.length -1];
        return mass2;
    }

    public static Integer[] insert2 (int[] mass, int k, int c) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < mass.length ; i++) {
            list.add(mass[i]);
        }
        list.add(k, c);
        return list.toArray(new Integer[list.size()]);
    }

    public static void shift (int[] mass, boolean k){
        if (k) {
            int temp = mass[mass.length-1];
            for (int i = mass.length -1; i > 0; i--) {
                mass[i] = mass[i -1];
            }
            mass[0] = temp;
        }
        else {
            int temp = mass[0];
            for (int i = 0; i < mass.length - 1; i++) {
                mass[i] = mass[i + 1];
            }
            mass[mass.length -1] = temp;
        }
    }

    public static void shift2 (int[]mass, int k) {
        /*boolean kk = true;
        if(k < 0)
            kk = false;*/
        for (int i = 0; i < Math.abs(k); i++)
            ArraysUtil.shift(mass, k > 0);

        /*if (k >0)
            for (int i = 0; i < k; i++) {
               ArraysUtil.shift(mass, true);
        }
        if (k < 0)
            for (int i = 0; i < Math.abs(k); i++) {
                ArraysUtil.shift(mass, false);
            }*/
    }

    public static boolean equals (int[] mass, int[] mass2) {
        if (mass.length != mass2.length)
            return false;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != mass2[i])
                return false;
        }
        return true;
    }

    public static boolean equals2(int[] mass, int[] mass2) {
        for (int i = 0; i < mass.length; i++) {
            boolean isPair = false;
            for (int j = 0; j < mass2.length ; j++) {
                if(mass[i] == mass2[j])
                    isPair = true;
            }

            if(!isPair)
                return false;
        }
        return true;
    }


    public static int[] copyOf(int[] mass, int newLenght) {
        int[] mass2 = new int[newLenght];
        int a = newLenght;
        if (newLenght >= mass.length)
            a = mass.length;

        for (int i = 0; i < a; i++) {
            mass2[i] = mass[i];
        }
        return mass2;
    }

    public static int[] copyOfRange(int[] mass, int a, int b) {
        int[] mass2 = new int[b +1 -a];
        if (mass.length < a)
            return null;
        if (mass.length >= b)
            for (int i = a; i <= b ; i++) {
                mass2[i -a] = mass[i];
            }
        if (mass.length < b)
            for (int i = a; i < mass.length ; i++) {
                mass2[i -a] = mass[i];
            }
        return mass2;
    }

    public static int search(int[] mass, int k) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == k)
                return i;
        }
        return -1;
    }

    public static int[] search1(int[] mass, int k) {
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == k)
                n++;
        }
        int[] newMass = new int[n];
        for (int i = 0, j=0; i < mass.length; i++) {
                if(mass[i] == k)
                    newMass[j++] = i;
        }
        return newMass;
    }

    public static ArrayList<Integer> search2 (int[] mass, int k) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == k)
                myList.add(i);
        }
        return myList;
    }

    public static void sort(int[] mass) {
        int temp;
        for (int j = 0; j < mass.length-1 ; j++) {
            for (int i = 0; i < mass.length -j-1; i++) {
                if (mass[i] > mass[ i + 1]){
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                }
            }
        }
    }

    public static void sort(Integer[] mass, Comparator<Integer> cmp) {
        int temp;
        for (int j = 0; j < mass.length-1 ; j++) {
            for (int i = 0; i < mass.length -j-1; i++) {
                if (cmp.compare(mass[i], mass[ i + 1]) >= 1){
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                }
            }
        }
    }

    public static int nearest(int[] mass, int x) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) <= min){
                min = Math.abs(mass[i] -x);
                j = mass[i];
            }
        }
        return j;
    }

    public static int[] nearest2(int[] mass, int x){
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] -x) < min) {
                min = Math.abs(mass[i] - x);
                count = 0;
            }
            if (Math.abs(mass[i] - x) == min)
                count++;
        }
        int[] mass2 = new int[count];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) == min)
                mass2[j++] = mass[i];
        }
        return mass2;
    }

    public static ArrayList<Integer> nearest3(int[] mass, int x) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) < min){
                min = Math.abs(mass[i] -x);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] -x) == min)
                list.add(mass[i]);
        }
        return list;
    }

    public static int[] nearest4(int[] mass){
        int min = Integer.MAX_VALUE;
        int a =0 ,b = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (Math.abs(mass[i + 1] - mass[i]) < min) {
                min = Math.abs(mass[i + 1] - mass[i]);
                a = mass[i];
                b = mass[i + 1];
            }
        }
        int[] mass2 = new int[] {a, b};
        return mass2;
    }

    public static int[] test(){
        int[] mass = new int[1000];
        int a = 0;
        int b = 5000;
        for (int i = 0; i < mass.length; i++) {
            int x = a + (int)(Math.random() *b);
            mass[i] = x;
        }
        return ArraysUtil.nearest4(mass);
    }

    public static boolean isOrder(int[] mass) {
        boolean a = true, b = true;
        for (int i = 0; i < mass.length -1; i++) {
            if (!(mass[i] <= mass[i+1]))
                a = false;
            if (!(mass[i] >= mass[i+1]))
                b = false;
        }
        return a || b;
    }

    public static int frequent(int[] mass) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < mass.length; i++) {
            int n = 1;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] == mass[i]) {
                    n++;
                }
            }
            if (n > a) {
                a = n;
                b = mass[i];
            }
        }
        return b;
    }

    public static boolean isPrime(int a){
        for (int i = 2; i < a; i++)
            if (a % i == 0)
                return false;
        return true;
    }

    public static void fillPrimeRandom(int[] mass) {
        for (int i = 0; i < mass.length;) {
            int a;
            do {
                a = (int)(Math.random() * Integer.MAX_VALUE);
            }
            while (!isPrime(a));
            mass[i] = a;
            i++;

        }
    }

    public static int indexInsertion (int[] mass, int x) {
        int i = 0;
        int a= 0;
        while (i < mass.length && mass[i] <= x){
            i++;
            a = i;
        }
        return a +1;
    }

    public static int countEqualPairs (int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i+1; j < mass.length; j++) {
                if(mass[i] == mass[j])
                    count++;
            }
        }
        return count;
    }

    public static boolean isElsDifferent(int[] mass) {
        return countEqualPairs(mass) == 0;

    }

    public static Integer median (int[] mass) {
        int med = 0;
        if (!isElsDifferent(mass) || mass.length % 2 == 0)
            return null;

        for (int i = 0; i <= mass.length / 2; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < mass.length; j++) {
                if (mass[j] < min && mass[j] > med)
                    min = mass[j];
            }
            med = min;
        }
        return med;
    }

    public static int[] unique(int[] mass) {
        int n = mass.length;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i+1; j < mass.length; j++) {
                if(mass[j] == mass[i])
                    n--;
            }
        }
        int[] newMass = new int[n];
        n = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i+1; j < mass.length; j++) {
                if(mass[j] != mass[i])
                    newMass[n++] = mass[i];
            }
        }
        return newMass;
    }

    public static ArrayList<Integer> unique2(int[] mass) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < mass.length ; i++) {
            for (int j = i+1; j < mass.length; j++) {
                if(mass[j] != mass[i])
                    list.add(mass[i]);
            }
        }
        return list;
    }


}
