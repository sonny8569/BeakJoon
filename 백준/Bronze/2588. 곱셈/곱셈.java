import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        int[] answer = new int[num2.length() +1];
        int index = 1;
        for(int i =0; i< num2.length(); i++){
            answer[i] = num1 * (num2.charAt(num2.length()-index) -'0');
            index ++;
        }
        answer[num2.length()] = num1 * Integer.parseInt(num2);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

    }
}