import java.util.Arrays;

public class task12 {
    
    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        
        if (array.length >= 2) {
            result[0] = false;
            result[1] = false;
            
            for (int i = 2; i < array.length; i++) {
                result[i] = (array[i] == array[i - 1] + array[i - 2]);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] result = getSumCheckArray(numbers);
        System.out.println(Arrays.toString(result));
    }
}