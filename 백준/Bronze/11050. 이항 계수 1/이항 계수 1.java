import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(answer(n,k));

    }
    private static long answer(int n, int k){
        if(k <0 || k >n) return 0;
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static long factorial(int n){
        long result =1;
        for(int i=2; i<=n;i++){
            result *=i;
        }
        return result;
    }

}