import java.util.Scanner;

public class task03 {
    final static int pass = 17135;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть код доступу: ");
        int tryPass = scanner.nextInt();
        
        if (tryPass == pass) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
        scanner.close();
    }
}