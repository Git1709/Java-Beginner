public class Program_to_add_2_complex_numbers {

    double real;
    double imag;

    public Program_to_add_2_complex_numbers(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        Program_to_add_2_complex_numbers n1 = new Program_to_add_2_complex_numbers(2.3, 4.5),
                n2 = new Program_to_add_2_complex_numbers(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Program_to_add_2_complex_numbers add(Program_to_add_2_complex_numbers n1,
            Program_to_add_2_complex_numbers n2) {
        Program_to_add_2_complex_numbers temp = new Program_to_add_2_complex_numbers(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return (temp);
    }
}
