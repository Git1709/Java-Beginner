import java.util.Scanner;

public class Program_to_Print_a_table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print table of");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}