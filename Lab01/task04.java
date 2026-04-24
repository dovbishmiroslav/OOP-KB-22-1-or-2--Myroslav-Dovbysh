import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість незнайомців: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        if (count < 0) {
            System.out.println("Кількість не може бути від'ємною!");
        } else if (count == 0) {
            System.out.println("Немає незнайомців для привітання.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print("Введіть ім'я незнайомця " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }
        scanner.close();
    }
}