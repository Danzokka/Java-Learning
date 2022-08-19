import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira um numero: ");
            int num = in.nextInt();

            for(int i = 1; i<=10; i++){
                System.out.printf("%d x %d = %d \n", num, i , num*i);
            }
        }
    }
}
