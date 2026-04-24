import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean isWorking = true;
        int max = 0;

        while (isWorking){
            System.out.print("Введіть наступне число або 0 для завершення: ");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            if (num == 0) {
                isWorking = false;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("Найбільше число: " + max);
        sc.close();
    }
}
