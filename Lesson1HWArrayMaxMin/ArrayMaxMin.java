import java.util.Arrays;
import java.util.Random;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int [] array=createArray();
        int max = maxArray(array);
        int min = minArray(array);
        int sum = max + min;
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);

    }
    /**
     * Method created array of integer numbers
     * @return arrayRandom <code> int [] </code> [] integer number
     * @author Xena
     */
    public static int[] createArray() {
        Random rn = new Random();
        int n = 10;
        int[] arrayRandom = new int[n];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = rn.nextInt(100);
        }
        return arrayRandom;
    }
    /**
     * Method return maximum from the array integer numbers
     * @param a <code> int[] </code> array of integer
     * @return max <code>int</code> integer number
     * @author Xena
     */
    public static int maxArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    /**
     * Method return minimum from the array integer numbers
     * @param a <code> int[] </code> array of integer
     * @return min <code>int</code> integer number
     * @author Xena
     */
    public static int minArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

}
