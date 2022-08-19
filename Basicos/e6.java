import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
           
            System.out.print("Insira o primeiro numero: ");
            int num1 = in.nextInt();

            System.out.print("Insira o segundo numero: ");
            int num2 = in.nextInt();     
            
            System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
            System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
            System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
            System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
            System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
        }        
    }
}
