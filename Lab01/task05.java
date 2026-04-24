import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть a (підйом за день): ");
        int a = scanner.nextInt();
        System.out.print("Введіть b (сповзання за ніч): ");
        int b = scanner.nextInt();
        System.out.print("Введіть h (висота дерева): ");
        int h = scanner.nextInt();
        
        if (a >= h) {
            System.out.println(1);
}       else if (a <= b) {
            System.out.println("Impossible");
}        else {
            int days = 1;
            int height = a;
            while (height < h) {
            height -= b;
            days++;
            height += a;
    }
    System.out.println(days);

}
}
}