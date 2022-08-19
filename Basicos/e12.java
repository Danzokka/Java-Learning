import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira o primeiro numero: ");
            float num1 = in.nextFloat();

            System.out.print("Insira o segundo numero: ");
            float num2 = in.nextFloat();

            System.out.print("Insira o terceiro numero: ");
            float num3 = in.nextFloat();

            System.out.printf("A media dos numeros %.2f %.2f %.2f e %.2f", num1, num2, num3, (num1+num2+num3)/3);
        }
    }
}
