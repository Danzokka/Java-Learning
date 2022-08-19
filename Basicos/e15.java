public class e15 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 0;

        System.out.printf("Antes de trocar, A = %d e B = %d \n", a, b);

        c = a;
        a = b;
        b = c;

        System.out.printf("Apos trocar, A = %d e B = %d", a, b);
    }
}
