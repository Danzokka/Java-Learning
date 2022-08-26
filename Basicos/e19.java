import java.util.Scanner;

public class e19 {
    public static void main(String[] args) {
        
        int i=1, num, quot, j;  
        int numBin[] = new int[100];
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira um numero decimal: ");
            num = in.nextInt();
        }

        quot = num;

        while(quot!=0){
            numBin[i++] = quot%2;
            quot = quot/2;
        }

        System.out.print("O número decimal em binário é: ");

        for(j=i-1; j>0; j--){
            System.out.print(numBin[j]);
        }

        System.out.println("");
    }
}
