import java.util.Arrays;

public class task14 {
    public static void cycleSwap(int[] array) {
        if (array.length > 1) {
           int last = array[array.length - 1];
           for (int i = array.length - 1; i > 0; i--) {
               array[i] = array[i - 1];
           }
           array[0] = last;
        }
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length > 0) {
            shift = shift % array.length;
            int[] temp = new int[array.length];
            
            for (int i = 0; i < array.length; i++) {
                temp[(i + shift) % array.length] = array[i];
            }
            
            System.arraycopy(temp, 0, array, 0, array.length);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4};
        System.out.println("Початковий масив: " + Arrays.toString(arr1));
        cycleSwap(arr1);
        System.out.println("Після зсуву на 1: " + Arrays.toString(arr1));
        
        int[] arr2 = {1, 3, 2, 7, 4};
        System.out.println("\nПочатковий масив: " + Arrays.toString(arr2));
        cycleSwap(arr2, 3);
        System.out.println("Після зсуву на 3: " + Arrays.toString(arr2));
    }
}

