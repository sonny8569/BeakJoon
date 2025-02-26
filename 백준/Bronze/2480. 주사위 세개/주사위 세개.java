import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] dataArray = data.split(" ");
        int count = 0;
        int maxData = 0;
        for (int i = 0; i < dataArray.length; i++) {
            String firstData = dataArray[i];
            for (int j = i + 1; j < dataArray.length; j++) {
                if(Objects.equals(firstData, dataArray[j])){
                    count ++;
                    maxData = Integer.parseInt(dataArray[i]);
                }
            }
            if(count == 0){
               if(maxData < Integer.parseInt(firstData)){
                   maxData = Integer.parseInt(firstData);
               }
            }
        }
        if(count == 3){
            System.out.println(10000 + (maxData * 1000));
            return;
        }
        if(count == 1){
            System.out.println(1000 + (maxData * 100));
            return;
        }
       System.out.println(maxData * 100);
    }
}
