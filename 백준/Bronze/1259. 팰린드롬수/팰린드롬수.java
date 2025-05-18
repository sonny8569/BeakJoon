import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String data  = br.readLine();
            if(Integer.parseInt(data) == 0) break;
            String reversData = "";
            for(int i= data.length()-1; i>=0; i--){
                reversData += data.charAt(i);
            }
            if(data.equals(reversData)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }
}