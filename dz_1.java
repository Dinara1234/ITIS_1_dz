import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (true) {
            int x = in.nextInt();
            if (x == 5){
                i+=1;
            }
            if (x == 0){
                if (i > 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");


                }
                break;

            }
        }
    }
}
