import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if(a > 0 && b > 0){
            System.out.println("1");
            return;
        }
        if(a >0 && b < 0){
            System.out.println("4");
            return;
        }
        if(a < 0 && b > 0){
            System.out.println("2");
            return;
        }
        System.out.println("3");
    }
}