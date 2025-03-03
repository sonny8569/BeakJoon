import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bill = Integer.parseInt(br.readLine());
        int amount = Integer.parseInt(br.readLine());
        int inputStuffAmount = 0;
        long total = 0;
        for (int i = 0; i < amount; i++) {
            String[] data = br.readLine().split(" ");
            long stuffPrice = Long.parseLong(data[0]);
            int stuffAmount = Integer.parseInt(data[1]);
            inputStuffAmount++;
            total += stuffAmount * stuffPrice;
        }
        if (amount != inputStuffAmount) {
            System.out.println("No");
            return;
        }
        if (bill != total) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
