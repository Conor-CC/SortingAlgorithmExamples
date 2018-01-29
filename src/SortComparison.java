// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2018
 */

class SortComparison {

    static final int INSERTION_CUTOFF = 10;

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    //Start from element of index 1
    //Shift element left until it encounters a smaller element.
    //Increment first loop and repeat.
    static double [] insertionSort (double a[]){
        if (a == null)
            return null;
        double cmp; int j;
        for (int i = 1; i < a.length; i++) {
            cmp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > cmp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = cmp;
        }
        return a;
        //todo: implement the sort
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){

        //todo: implement the sort
        if (a == null)
            return null;
        return recursiveQuick(a, 0, a.length - 1);

    }//end quicksort

    private static double[] recursiveQuick(double[] a, int lo, int hi) {
        if (hi <= lo) {
            return a;
        }
        int pivotPos = partition(a, lo, hi);
        a = recursiveQuick(a, lo, pivotPos);
        a = recursiveQuick(a, pivotPos + 1, hi);
        return a;
    }

    private static int partition(double[] a, int lo, int hi) {
        int i = lo; int j = hi + 1;
        double pivot = a[i];
        while (true) {
            while(a[++i] < pivot)
                if (i == hi)    break;
            while(a[--j] > pivot)
                if (j == lo)    break;
            if (i >= j) break;
            double tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        a[lo] = a[j];
        a[j] = pivot;
        return j;
    }

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] mergeSort (double a[]) {
        if (a == null)
            return null;
        double[] aux = new double[a.length];
        mergeSort(a, aux, 0, a.length - 1);
        //todo: implement the sort
        return a;
    }//end mergesort

    private static double[] mergeSort(double a[], double[] aux, int lo, int hi) {
        if (hi <= (lo + INSERTION_CUTOFF - 1)) {
            insertionSort(a, lo, hi);
            return a;
        }
        if (hi <= lo) return a;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, aux, lo, mid);             //Deals with left subtrees (if taken as BST traversal)
        mergeSort(a, aux, mid + 1, hi);      //Deals with right subtrees
        merge(a, aux, lo, mid, hi);             //Slaps all the subtrees together in sorted order
        return a;
    }

    private static double[] merge(double[] a, double[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) aux[k] = a[k]; //Copy contents of a into aux
        int i = lo;
        int j = mid + 1;
        //'i' starts at the first subarray relative to passed parameters
        //'j' starts at the second subarray relative to the past parameters
        // EXAMPLE:
        // KEY:   lo       mid  |             hi
        // INDX:  i             |    j
        // VALS:  3    7    8   |    6    8    3
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                a[k] = aux[j++];//if all of the left is already sorted pretty much
            else if (j > hi)            a[k] = aux[i++];//if all of the right has been sorted
            else if (aux[j] < aux[i])   a[k] = aux[j++];//Where most of the sorting happens
            else                        a[k] = aux[i++];//As above.
        }
        return a;
    }

    private static double[] insertionSort(double[] a, int lo, int hi) {
        double cmp; int j;
        for (int i = lo; i <= hi; i++) {      //Less than or equal to account for ranges smaller than a.length
            cmp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > cmp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = cmp;
        }
        return a;
    }


    /**
     * Sorts an array of doubles using Shell Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    //Take every h-th element starting from any element
    //Order the produced sequence
    //Repeat with smaller h value (based off of sequence generated by ((1/2) * (3^k + 1))  )
    public static double [] shellSort (double a[]){
        if (a == null)
            return null;
        double temp;
        int h = 1;
        while (h < a.length/3)  h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && (a[j] < a[j - h]); j -= h) {
                    temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            h /= 3;
        }
        //todo: implement the sort
        return a;
    }//end shellsort

    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    //Find the smallest entry between 'i' and 'n'.
    //Swap the smallest entry found between 'i' and 'j' with the selected element of the first loop.
    public static double [] selectionSort (double a[]){
        if (a == null)
            return null;
        int minNumIndex;
        double tmp;
        for (int i = 0; i < a.length - 1; i++) {
            minNumIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minNumIndex]) {
                    minNumIndex = j;
                }
            }
            tmp = a[minNumIndex];
            a[minNumIndex] = a[i];
            a[i] = tmp;
        }
        //todo: implement the sort
        return a;
    }//end selectionsort

    /**
     * Sorts an array of doubles using Bubble Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    public static double [] bubbleSort (double a[]){
        if (a == null)
            return null;
        double temp;
        for (int i = 0 ; i < a.length; i ++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        //todo: implement the sort
        return a;
    }//end bubblesort


//    public static void main(String[] args) {
//
//        //todo: do experiments as per assignment instructions
//    }

}//end class
