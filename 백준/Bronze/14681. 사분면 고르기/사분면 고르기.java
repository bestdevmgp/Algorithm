import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        Integer y = sc.nextInt();

        if (x > 0 && y > 0){
            System.out.println("1");
        } else if (x < 0 && y > 0){
            System.out.println("2");
        } else if (x < 0 && y < 0){
            System.out.println("3");
        } else if (x > 0 && y < 0){
            System.out.println("4");
        }
    }
}