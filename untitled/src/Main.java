public class Main {
    public static void main(String[] args) {
        int[] in1 = {7, 8, 9, 10, 11};
        int[] outArray1 = filterEvenIndexOddValue(in1);
        System.out.println(java.util.Arrays.toString(outArray1));

        int[] in2 = {3, 3, 3, 2, 2};
        int[] outArray2 = filterEvenIndexOddValue(in2);
        int dom = findDominant(outArray2);
        System.out.println(dom);

        int[] in3 = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(rotateArray(in3,2)));

    }


   // TASK 1
    /**
     * This method filters array elements, keeping only those
     * that are at even indices (0, 2, 4, ...)
     * and are simultaneously odd numbers.
     *
     * @param array array of integers
     * @return new array with filtered elements
     */
    public static int[] filterEvenIndexOddValue(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 == 1) {
                count++;
            }
        }
        int[] out = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 == 1 ) {
                out[index++] = array[i];

            }
        }
        return out;
    }


    // TASK2
    /**
     * This method finds the dominant element in an array of integers.
     * A dominant element is one that occurs more than n/2 times,
     * where n is the length of the array.
     *
     * @param array array of integers
     * @return the dominant element or -1 if it doesn't exist
     */
    public static int findDominant(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int count1 = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count1++;
                }
            }
            if (count1 > array.length / 2) {
                return array[i];
            }
        }
        return -1;
    }

    // TASK 3
    /**
     * This method performs a rotation of array elements by the given number of positions.
     *
     * @param array array of integers
     * @param positions number of positions to shift
     * @return new array after performing the rotation
     *
     *
     */
    public static int[] rotateArray(int[] array, int positions) {
        // Your code here
        if (array == null || array.length <= 1) {
            return array;
        }

        int n = array.length;
        positions = positions % n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - positions) % n;
            rotated[newIndex] = array[i];
        }

        return rotated;



    }
}