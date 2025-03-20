public class Main {
    public static void main(String[] args) {
        int[] in1 = {7, 8, 9, 10, 11};
        int[] outArray1 = filterEvenIndexOddValue(in1);
        System.out.println(java.util.Arrays.toString(outArray1));

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
}