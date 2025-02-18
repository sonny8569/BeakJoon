
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == 0 && y == 0 && z == 0) break;
            if((x * x + y*y) == z*z){
                System.out.println("right");
                continue;
            }
            if((x * x + z*z) == y*y){
                System.out.println("right");
                continue;
            }
            if((y* y+ z*z) == x*x){
                System.out.println("right");
                continue;
            }
            System.out.println("wrong");
        }

    }
}
