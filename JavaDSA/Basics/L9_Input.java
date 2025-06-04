import java.util.Scanner;

public class L9_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        
        for(int i = 0; i<=n; i++){
            System.out.println(n);
        }
        sc.close();

    }
}
