import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
