import java.util.Scanner;

public class e13 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira a altura do retangulo: ");
            float num1 = in.nextFloat();
            System.out.print("Insira a largura do retangulo: ");
            float num2 = in.nextFloat();

            System.out.printf("A area do retangulo e: %.2f \n O perimetro do retangulo e: %.2f", (num1*num2), 2*(num1+num2));
        }
    }
}
