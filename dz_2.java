import java.util.Scanner;

public class dz_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_ch = -1;
        while (true){
            int x = in.nextInt();
            if(x > max_ch) {
                max_ch = x;
            }
            if (x == 0){
                System.out.println(max_ch);
                break;
            }
        }

    }
}
