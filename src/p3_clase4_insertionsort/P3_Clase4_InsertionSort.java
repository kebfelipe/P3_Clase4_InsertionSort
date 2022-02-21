package p3_clase4_insertionsort;

/**
 *
 * @author StormTK
 */
public class P3_Clase4_InsertionSort {

 
    public static void main(String[] args) {
        int[] intArray = {25, 1, 0, 40, 7, 19, 8};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        for (int c = 0; c < intArray.length; c++) {
            System.out.println(intArray[c]);
        }
    }

}
