public class task11 {
    public static int sum(int [] array){
        int sumEven = 0;
        if (array == null || array.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
            
                if (array[i] % 2 == 0) {
                    sumEven += array[i];
                }
            }
        } 
        return sumEven;
    }
    public static void main(String[] args) {
        int [] data1 = {1, 5, 3, 9, 14, 5, 8, 4, 7, 6};
        int [] data2 = {};
        int [] data3 = {2, 4, 6, 8, 10};
        System.out.println("Sum of even numbers: " + sum(data1));
        System.out.println("Sum of even numbers: " + sum(data2));
        System.out.println("Sum of even numbers: " + sum(data3));
    }
}
