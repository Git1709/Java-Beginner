import java.util.Scanner;

public class program_to_print_the_number_of_digits_of_the_given_number {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a natural number");
        double count = 0;double num = scanner.nextDouble();

        while (num >0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}