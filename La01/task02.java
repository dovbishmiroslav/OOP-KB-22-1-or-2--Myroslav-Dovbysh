import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість секунд: ");
        int sec = sc.nextInt();
        
        int hours = sec / 3600;
        int min = (sec % 3600) / 60;
        int secs = sec % 60;
        
        System.out.println(hours + ":" + String.format("%02d", min) + ":" + String.format("%02d", secs));
        sc.close();
    }
}