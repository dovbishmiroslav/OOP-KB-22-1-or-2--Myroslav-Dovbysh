import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму рахунку: ");
        double billAmount = scanner.nextDouble();
        System.out.print("Введіть кількість друзів: ");
        int friendsCount = scanner.nextInt();
        
        if (billAmount < 0) {
            System.out.println("Сума рахунку не може бути від'ємною!");
        } else if (friendsCount <= 0) {
            System.out.println("Кількість друзів має бути додатньою!");
        } else {
            double totalWithTip = billAmount * 1.1;
            double forFriend = totalWithTip / friendsCount;
            System.out.println(forFriend);
        }
        scanner.close();
    }
}
