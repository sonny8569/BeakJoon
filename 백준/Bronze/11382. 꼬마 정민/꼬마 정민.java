import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        long num1 = Long.parseLong(data[0]);
        long num2 = Long.parseLong(data[1]);
        long num3 = Long.parseLong(data[2]);
        System.out.println(num1 + num2 + num3);
    }
}