import java.io.*;

class Solution {
    public String solution(String s) throws IOException {
        String[] dataArray = s.split(" ");
        for (int i = 0; i < dataArray.length; i++) {
            String strData = dataArray[i];
            int minIndex = i;
            for (int j = i + 1; j < dataArray.length; j++) {
                if (Integer.parseInt(dataArray[j]) < Integer.parseInt(strData)) {
                    strData = dataArray[j];
                    minIndex = j;
                }
            }
            swap(dataArray , i , minIndex);
        }
        String answer = dataArray[0]+" "+dataArray[dataArray.length-1];
        return answer;
    }
    private void swap(String[] arr, int inx1, int inx2){
        String temp = arr[inx1];
        arr[inx1] = arr[inx2];
        arr[inx2] = temp; 
    }
}