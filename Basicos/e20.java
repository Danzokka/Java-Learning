import java.util.Scanner;

public class e20 {
    public static void main(String[] args) {
        
        int rem,num;  
        String hexDecNum = "";
        char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira um numero decimal: ");
            num = in.nextInt();
        }

        

        while(num>0){
            rem = num%16;
            hexDecNum = hex[rem] + hexDecNum;
            num = num/16;
        }

        System.out.printf("O número decimal em hexadecimal é: %s", hexDecNum);
    }
}
