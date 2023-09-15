import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int i;
        for (i = k; i<=m; i++){
            if(i%3== 0){
                System.out.println(i);
            }

        }



    }
}