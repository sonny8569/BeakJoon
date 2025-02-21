import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int target = sc.nextInt();
        int day = (target - down) / (up - down);
        if((target - down) % (up - down) != 0){
            day++;
        }
        System.out.println(day);
    }
}