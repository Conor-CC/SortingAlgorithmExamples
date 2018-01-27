import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
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


    static double[] a; //= {2377.88, 2910.66, 8458.14, 1522.08, 5855.37, 1934.75, 8106.23, 1735.31, 4849.83, 1518.63};

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
    }


    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        a = readInFile(a, "numbers10.txt");
        for (Double d : a)
            System.out.print(d + "    ");
        System.out.println("\n");
        a = SortComparison.mergeSort(a);
        for (Double d : a)
            System.out.print(d + "    ");
        //TODO: implement this method
    }

    private static double[] readInFile(double[] a, String fileName) {
        File file = new File("src/" + fileName);
        Scanner doubleScanner;
        ArrayList<Double> doubles = new ArrayList<Double>();
        try {
            doubleScanner = new Scanner(file);
            while (doubleScanner.hasNextDouble()){
                doubles.add(doubleScanner.nextDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        a = new double[doubles.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = (Double) doubles.get(i);
        }
        return a;
    }



}
