public class task10 {
    public static int max(int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] data = {1, 5, 3, 9, 14, 5, 8, 4, 7, 6};
        System.out.println("Max: " + max(data));
    }
}
