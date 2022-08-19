import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Insira o raio: ");
            float raio = in.nextFloat();    

            double perimetro = 2 * Math.PI * raio;
            double area = Math.PI * raio * raio;

            System.out.printf("Perimetro = %f \nArea = %f", perimetro, area);
        } 
            
    }
}
