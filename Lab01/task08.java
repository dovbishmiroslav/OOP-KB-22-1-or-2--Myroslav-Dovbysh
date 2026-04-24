import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean isWorking = true;
        int avg= 0;
        int count = 0;
        int total = 0;

        while (isWorking){
            System.out.print("Введіть наступне число або 0 для завершення: ");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            if (num == 0) {
                isWorking = false;
                System.out.println("Середнє арифметичне: " + avg);
            } else {
                count ++;
                total += num;
                avg = total / count;
            }
        }
    }
 }

