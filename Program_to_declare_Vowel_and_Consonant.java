import java.util.Scanner;

public class Program_to_declare_Vowel_and_Consonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        char ch =scanner.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}