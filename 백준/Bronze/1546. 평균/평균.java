import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] scoreArray = new int[index];
        int maxScore = -1;
        for(int i=0;i<index; i++){
            int score = sc.nextInt();
            if(maxScore < score){
                maxScore = score;
            }
            scoreArray[i] = score;
        }
        float total = 0;
        for(int i=0;i<scoreArray.length; i++){
            total += (float) scoreArray[i] / maxScore * 100;
        }
        System.out.println(total / index);
    }

}