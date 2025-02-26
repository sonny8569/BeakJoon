import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] dataArray = data.split(" ");
        int hour = Integer.parseInt(dataArray[0]);
        int min = Integer.parseInt(dataArray[1]);
        int moreTime = Integer.parseInt(br.readLine());
        while (true) {
            if(min + moreTime < 60){
                min += moreTime;
                if(hour >= 24){
                    hour -= 24;
                }
                break;
            }
            hour++;
            moreTime -= 60;
        }
        System.out.println(hour +" "+min);
    }
}
