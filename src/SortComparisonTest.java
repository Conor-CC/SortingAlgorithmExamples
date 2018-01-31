import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2018
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{


    static double[] a;

    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
        double[] a = null;
        SortComparison.quickSort(a);
        assertNull(a);
        SortComparison.mergeSort(a);
        assertNull(a);
        SortComparison.insertionSort(a);
        assertNull(a);
        SortComparison.bubbleSort(a);
        assertNull(a);
        SortComparison.selectionSort(a);
        assertNull(a);
        SortComparison.bubbleSort(a);
        assertNull(a);
        SortComparison.shellSort(a);
        assertNull(a);
    }

    @Test
    public void testNumbers10() {
        double[] preSorted = {1518.63, 1522.08, 1735.31, 1934.75, 2377.88,
                2910.66, 4849.83, 5855.37, 8106.23, 8458.14};

        double[] unSorted = {2377.88,2910.66,8458.14,1522.08,5855.37,1934.75,8106.23,1735.31,4849.83,1518.63};

        a = unSorted;
        SortComparison.quickSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unSorted;
        SortComparison.mergeSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unSorted;
        SortComparison.insertionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unSorted;
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unSorted;
        SortComparison.selectionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unSorted;
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unSorted;
        SortComparison.shellSort(a);
        assertArrayEquals(preSorted, a,  0);
    }

    @Test
    public void testNumbers100() {
        double[] preSorted = {131.11,141.639,381.004,398.718,401.409,483.631,777.565,782.337,869.318,1018.14,1044.55,
                1051.9,1080.22,1197.52,1209.76,1518.63,1522.08,1584.62,1600.44,1612.96,1735.31,1934.75,1942.31,1961.97,
                2092.05,2121.29,2203.51,2345.15,2377.88,2543.55,2652.57,2724.57,2742.11,2765.55,2910.66,3193.47,3242.55,
                3321.58,3669.57,3769.34,3776.63,3978.32,4211.62,4373.9,4482.08,4500.86,4538.89,4659.33,4672.51,4829.45,
                4849.83,4917.36,4918.37,5015.19,5029.31,5105.3,5347.12,5593.97,5673.94,5710.77,5855.37,5860.52,5991.63,
                6317.98,6386.02,6393.96,6766.97,6869.2,6888.98,7054.32,7080.34,7163.23,7201.84,7202.92,7319.42,7598.96,
                7695.48,7788.8,7984.93,8106.23,8351.59,8386.34,8458.14,8541.65,8557.19,8663.13,8740.03,8931.88,8967.82,
                8997.56,9041.07,9076.23,9100.94,9286.11,9350.69,9363.01,9443.28,9456.25,9466.56,9955.53};

        double[] unordered = {131.11,141.639,381.004,398.718,401.409,483.631,777.565,782.337,869.318,1018.14,1044.55,1051.9,1080.22,1197.52,1209.76,1518.63,1522.08,1584.62,1600.44,1612.96,1735.31,1934.75,1942.31,1961.97,2092.05,2121.29,2203.51,2345.15,2377.88,2543.55,2652.57,2724.57,2742.11,2765.55,2910.66,3193.47,3242.55,3321.58,3669.57,3769.34,3776.63,3978.32,4211.62,4373.9,4482.08,4500.86,4538.89,4659.33,4672.51,4829.45,4849.83,4917.36,4918.37,5015.19,5029.31,5105.3,5347.12,5593.97,5673.94,5710.77,5855.37,5860.52,5991.63,6317.98,6386.02,6393.96,6766.97,6869.2,6888.98,7054.32,7080.34,7163.23,7201.84,7202.92,7319.42,7598.96,7695.48,7788.8,7984.93,8106.23,8351.59,8386.34,8458.14,8541.65,8557.19,8663.13,8740.03,8931.88,8967.82,8997.56,9041.07,9076.23,9100.94,9286.11,9350.69,9363.01,9443.28,9456.25,9466.56,9955.53,
        };

        a = unordered;
        SortComparison.quickSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unordered;
        SortComparison.mergeSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unordered;
        SortComparison.insertionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unordered;
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unordered;
        SortComparison.selectionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unordered;
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = unordered;
        SortComparison.shellSort(a);
        assertArrayEquals(preSorted, a,  0);
    }


    
    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
//    public static void main(String[] args)
//    {
//        a = readInFile(a, "numbers100.txt");
//        for (Double d : a)
//            System.out.print(d + "    ");
//        System.out.println("\n");
//        a = SortComparison.bubbleSort(a);
//        for (Double d : a)
//            System.out.print(d + ",");
//        //TODO: implement this method
//    }
//
//    private static double[] readInFile(double[] a, String fileName) {
//        File file = new File("src/" + fileName);
//        Scanner doubleScanner;
//        ArrayList<Double> doubles = new ArrayList<Double>();
//        try {
//            doubleScanner = new Scanner(file);
//            while (doubleScanner.hasNextDouble()){
//                doubles.add(doubleScanner.nextDouble());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        a = new double[doubles.size()];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (Double) doubles.get(i);
//        }
//        return a;
//    }
//


}
