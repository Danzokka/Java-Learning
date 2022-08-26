import java.util.Scanner;

public class e21 {
    public static void main(String[] args) {
        
        int rem,num;  
        String hexDecNum = "";
        char hex[]= {'0','1','2','3','4','5','6','7','8'};
        
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira um numero decimal: ");
            num = in.nextInt();
        }

        

        while(num>0){
            rem = num%8;
            hexDecNum = hex[rem] + hexDecNum;
            num = num/8;
        }

        System.out.printf("O número decimal em octal é: %s", hexDecNum);        
    }
}
